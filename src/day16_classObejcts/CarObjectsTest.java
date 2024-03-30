package day16_classObejcts;

public class CarObjectsTest {

    public static void main(String[] args) {

        CarTest bike1 = new CarTest();
        bike1.make = "Suzuki";
        bike1.model = "Best";
        bike1.currentSpeed = 150;
        bike1.color = "red";

        bike1.printCarInfo();
        bike1.drive();
        bike1.showCurrentSpeed(50);
        bike1.bikeInfo();

        CarTest bike2 = new CarTest();
        bike2.make = "Kwasaki";
        bike2.model = "T1000";

        bike2.printCarInfo();





    }



}
