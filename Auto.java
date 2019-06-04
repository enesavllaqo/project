import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Auto {

    private double velocity;
    private double acceleration;
    private int time = 1;

    public Auto(double velocity, double acceleration) {
        this.velocity = velocity;
        this.acceleration = acceleration;
    }

    public void addTime() {
        time++;
    }

    public double getDistance() {
        return velocity * time + (acceleration * time * time) / 2;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Auto");

        double velocity = Double.parseDouble(JOptionPane.showInputDialog(frame, "Velocity"));
        double acceleration = Double.parseDouble(JOptionPane.showInputDialog(frame, "Acceleration"));
        Auto auto = new Auto(velocity, acceleration);

        int answer = JOptionPane.showConfirmDialog(
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
