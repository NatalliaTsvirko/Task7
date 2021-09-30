package by.tsvirko.tasks.lesson7.task1;

import java.util.Scanner;

public class CivilPlane extends AirTransport{
    private int passengerNum;
    public boolean businessClass;

    public CivilPlane(double wingSpan, int minRunway, int passengerNum, boolean businessClass) {
        super(wingSpan, minRunway);
        this.passengerNum = passengerNum;
        this.businessClass = businessClass;
    }

    public CivilPlane(int power, int maxSpeed, int weight, String carModel, double wingSpan, int minRunway, int passengerNum, boolean businessClass) {
        super(power, maxSpeed, weight, carModel, wingSpan, minRunway);
        this.passengerNum = passengerNum;
        this.businessClass = businessClass;
    }

    public int getPassengerNum() {
        return passengerNum;
    }

    public void setPassengerNum(int passengerNum) {
        this.passengerNum = passengerNum;
    }

    public boolean getBusinessClass() {
        return businessClass;

    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;

    }

    public void passengerAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество пассажиров");
        int numPassenger = scanner.nextInt();
        if (numPassenger == passengerNum) {
            System.out.println("Самолет загружен");
        } else if (numPassenger > passengerNum) {
            System.out.println("Вам нужен самолет побольше");
        }else {
            System.out.println("Запускай еще!");
        }
    }

    public void displayInfo(){
        System.out.println("Мощность (л/с) : " + getPower() + " , " + "\n" + "максимальная скорость (км/ч) : "
                + getMaxSpeed() +" , " + "\n" + "масса(т) : " + getWeight() + " , " + "марка : " + getCarModel() + ", "
                + this.businessClass);

    }

    public void powerCalc(){

        double powerKv = 0;
        for (int i = 1; i <= getPower(); i++) {
            powerKv = i * 0.74;
        }
        System.out.println( "Мощность в кВ : " + powerKv);
    }
}
