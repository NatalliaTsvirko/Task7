package by.tsvirko.tasks.lesson7.task1;

import java.util.Scanner;

public class Truck extends LandTransport{

    private int lifting;

    public Truck(int lifting) {
        this.lifting = lifting;
    }

    public Truck(int countWheels, int fuelСonsumption, int lifting) {
        super(countWheels, fuelСonsumption);
        this.lifting = lifting;
    }

    public Truck(int power, int maxSpeed, int weight, String carModel, int countWheels, int fuelСonsumption, int lifting) {
        super(power, maxSpeed, weight, carModel, countWheels, fuelСonsumption);
        this.lifting = lifting;
    }

    public Truck(int power, int maxSpeed, int weight, String carModel, int lifting) {
        super(power, maxSpeed, weight, carModel);
        this.lifting = lifting;
    }

    public int getLifting() {
        return lifting;
    }

    public void setLifting(int lifting) {
        this.lifting = lifting;

    }

    public void powerCalc(){

        double powerKv = 0;
        for (int i = 1; i <= getPower(); i++) {
            powerKv = i * 0.74;
        }
        System.out.println( "Мощность в кВ : " + powerKv);
    }

    public void cargoAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массу груза : ");
        double wight = scanner.nextDouble();

        if (wight == lifting) {
            System.out.println("Грузовик загружен");
        } else if (wight > lifting) {
            System.out.println("Вам нужен грузовик побольше");
        }else {
            System.out.println("Грузи еще!");
        }
    }

    public void displayInfo(){
        System.out.println("Мощность (л/с) : " + getPower() + " , " + "\n" + "максимальная скорость (км/ч) : " + getMaxSpeed()
                +" , " + "\n" + "масса(т) : " + getWeight() + " , " + "\n" +"марка : " + getCarModel() + " , "
                + "расход топрлива :  " + getFuelСonsumption() + " , " +  "количество колес : "
                + getCountWheels() + " , грузоподьемность : " + this.lifting + " т ");

    }

}
