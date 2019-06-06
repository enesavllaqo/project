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
}
