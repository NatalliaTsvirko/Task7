package by.tsvirko.tasks.lesson7.task1;

public class LandTransport extends Transport{

    private int countWheels;
    private double fuelСonsumption;

    public LandTransport() {
    }

    public LandTransport(int countWheels, int fuelСonsumption) {
        this.countWheels = countWheels;
        this.fuelСonsumption = fuelСonsumption;
    }

    public LandTransport(int power, int maxSpeed, int weight, String carModel, int countWheels, int fuelСonsumption) {
        super(power, maxSpeed, weight, carModel);
        this.countWheels = countWheels;
        this.fuelСonsumption = fuelСonsumption;
    }

    public LandTransport(int power, int maxSpeed, int weight, String carModel) {
        super(power, maxSpeed, weight, carModel);
    }

    public int getCountWheels() {
        return countWheels;
    }

    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }

    public double getFuelСonsumption() {
        return fuelСonsumption;
    }

    public void setFuelСonsumption(int fuelСonsumption) {
        this.fuelСonsumption = fuelСonsumption;
    }
}
