package by.tsvirko.tasks.lesson7.task1;

import java.util.Scanner;

public class PassengerCar extends LandTransport{
    private String bodyCar;
    private int passengersNum;


    public PassengerCar() {
    }

    public PassengerCar(String bodyCar, int passengersNum) {
        this.bodyCar = bodyCar;
        this.passengersNum = passengersNum;

    }

    public PassengerCar(int countWheels, int fuelСonsumption, String bodyCar, int passengersNum) {
        super(countWheels, fuelСonsumption);
        this.bodyCar = bodyCar;
        this.passengersNum = passengersNum;
    }

    public PassengerCar(int power, int maxSpeed, int weight, String carModel, int countWheels, int fuelСonsumption, String bodyCar, int passengersNum) {
        super(power, maxSpeed, weight, carModel, countWheels, fuelСonsumption);
        this.bodyCar = bodyCar;
        this.passengersNum = passengersNum;
    }

    public PassengerCar(int power, int maxSpeed, int weight, String carModel, String bodyCar, int passengersNum) {
        super(power, maxSpeed, weight, carModel);
        this.bodyCar = bodyCar;
        this.passengersNum = passengersNum;
    }

    public String getBodyCar() {
        return bodyCar;
    }

    public void setBodyCar(String bodyCar) {
        this.bodyCar = bodyCar;
    }

    public int getPassengersNum() {
        return passengersNum;
    }

    public void setPassengersNum(int passengersNum) {
        this.passengersNum = passengersNum;
    }


    public void powerCalc(){

        double powerKv = 0;
        for (int i = 1; i <= getPower(); i++) {
            powerKv = i * 0.74;
        }
        System.out.println( "Мощность в кВ : " + powerKv);
    }

    public void kmRoad(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время движения легкового автомобиля в часах: ");
        double time = scanner.nextDouble();
        double distance = time * getMaxSpeed();
        double fuel = this.calculatingFuelConsumption(distance * getMaxSpeed());
        System.out.println("За время " + time + "ч, автомобиль " + getCarModel() +
                "\n" + "двигаясь с максимальной скоростью " + getMaxSpeed()  + "км/ч"
                + " проедет " + distance +  " километров"+ " и израсходует " + fuel + " литров топлива.");

    }

    private double calculatingFuelConsumption(double distance) {
        return getFuelСonsumption() / 100 * distance;
    }

    public void displayInfo(){
        System.out.println("Мощность (л/с) : " + getPower() + " , " + "\n" + "максимальная скорость (км/ч) : " + getMaxSpeed()
                +" , " + "\n" + "масса(кг) : " + getCountWheels() + " , " + "\n" + "марка : " + getCarModel() + " , "
                + "расход топрлива :  " + getFuelСonsumption() + " , " +  "количество колес : " + getCountWheels() +
                " , кузов : " + this.bodyCar + " , количество пассажиров : " + this.passengersNum + " . ");

    }
}
