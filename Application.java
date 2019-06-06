import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Application {

    private static int answer;
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Auto");

        double velocity = Double.parseDouble(JOptionPane.showInputDialog(frame, "Velocity"));
        double acceleration = Double.parseDouble(JOptionPane.showInputDialog(frame, "Acceleration"));
        Auto auto = new Auto(velocity, acceleration);

        answer = JOptionPane.showConfirmDialog(
                null, "Distance = " + auto.getDistance(),
                "Add time?",
                JOptionPane.DEFAULT_OPTION);
        while (answer == JOptionPane.YES_OPTION) {
            auto.addTime();
            answer = JOptionPane.showConfirmDialog(
                    frame, "Distance = " + auto.getDistance(),
                    "Add time?",
                    JOptionPane.DEFAULT_OPTION);
        }
    }
}
