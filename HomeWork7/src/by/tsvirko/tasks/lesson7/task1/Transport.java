package by.tsvirko.tasks.lesson7.task1;

public class Transport {

    private int power;
    private int maxSpeed;
    private int weight;
    private String carModel;

    public Transport() {
    }

    public Transport(int power, int maxSpeed, int weight, String carModel) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.carModel = carModel;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
}
