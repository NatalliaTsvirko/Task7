package by.tsvirko.tasks.lesson7.task1;

public class Main {

    public static void main(String[] args) {

        PassengerCar passengerCar = new PassengerCar(340,300,1285,"Audi",4,10,"Купе",5);
        System.out.println("Легковой автомобиль");
        passengerCar.displayInfo();
        passengerCar.powerCalc();
        passengerCar.kmRoad();


        Truck truck = new Truck(500,200,40,"Scania",12,450,19);
        System.out.println("Грузовой автомобиль");
        truck.displayInfo();
        truck.powerCalc();
        truck.cargoAmount();


        CivilPlane civilPlane = new CivilPlane(110000,850,79000,"Boeing 737-800",
                27.8,1000,100,true);
        System.out.println("Пассажирский самолет");
        civilPlane.displayInfo();
        civilPlane.powerCalc();
        civilPlane.passengerAmount();

        WarPlane warPlane = new WarPlane(500000,2430,28000,
                "Истребитель Су-27",14.70,500,true,150);
        System.out.println("Военный самолет");
        warPlane.displayInfo();
        warPlane.powerCalc();
        warPlane.shot();
        warPlane.ejection();

        WarPlane warPlaneTwo = new WarPlane(400000,2500,28000,
                "Истребитель Су-28",14.70,500,false,0);
        warPlaneTwo.displayInfo();
        warPlaneTwo.powerCalc();
        warPlaneTwo.shot();
        warPlaneTwo.ejection();

    }
}
