package by.tsvirko.tasks.lesson7.task1;

public class WarPlane extends AirTransport{

    private boolean ejectionSystem;
    private int rocketNum;

    public WarPlane(int power, int maxSpeed, int weight, double wingSpan, int minRunway, boolean ejectionSystem, int rocketNum) {
        super(wingSpan, minRunway);
        this.ejectionSystem = ejectionSystem;
        this.rocketNum = rocketNum;
    }

    public WarPlane(int power, int maxSpeed, int weight, String carModel, double wingSpan, int minRunway, boolean ejectionSystem, int rocketNum) {
        super(power, maxSpeed, weight, carModel, wingSpan, minRunway);
        this.ejectionSystem = ejectionSystem;
        this.rocketNum = rocketNum;
    }

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        this.ejectionSystem = ejectionSystem;
    }

    public int getRocketNum() {
        return rocketNum;
    }

    public void setRocketNum(int rocketNum) {
        this.rocketNum = rocketNum;
    }

    public void displayInfo(){
        System.out.println("Мощность (л/с) : " + getPower() + " , " + "\n" + "максимальная скорость (км/ч) : "
                + getMaxSpeed() +" , " + "масса(т) : " + getWeight() + " , " + "\n" + "марка : " + getCarModel()
                + " , " + "\n"  + "размах крыла :" + this.isWingSpan() +  "\n" +" система катапультирования : " +
                this.ejectionSystem + " , количество ракет на борту : " + this.rocketNum);

    }

    public void powerCalc(){

        double powerKv = 0;
        for (int i = 1; i <= getPower(); i++) {
            powerKv = i * 0.74;
        }
        System.out.println( "Мощность в кВ : " + powerKv);
    }

    public void shot() {

        if (getRocketNum() != 0) {
            System.out.println("Ракета пошла !");
        } else if (getRocketNum() == 0) {
            System.out.println("Боеприпасы отсутсвуют.");
        }

    }

    public void ejection() {

        if (ejectionSystem) {
            System.out.println("Катапультирование прошло успешно.");
        } else {
            System.out.println("У вас нет такой системы.");
        }
    }
}
