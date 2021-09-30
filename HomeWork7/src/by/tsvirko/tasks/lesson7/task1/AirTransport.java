package by.tsvirko.tasks.lesson7.task1;

public class AirTransport extends Transport{

    private double wingSpan;
    private int minRunway;

    public AirTransport(double wingSpan, int minRunway) {
        this.wingSpan = wingSpan;
        this.minRunway = minRunway;
    }

    public AirTransport(int power, int maxSpeed, int weight, String carModel, double wingSpan, int minRunway) {
        super(power, maxSpeed, weight, carModel);
        this.wingSpan = wingSpan;
        this.minRunway = minRunway;
    }

    public double isWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public int getMinRunway() {
        return minRunway;
    }

    public void setMinRunway(int minRunway) {
        this.minRunway = minRunway;
    }
}
