package day16_classObejcts;

public class CarTest {


    String make;
    String model;
    int currentSpeed;
    String color;

    public void printCarInfo(){
        String info = "Bike make =" + make + ", model =" + ", color" + color +
                ", current speed =" + currentSpeed;
        System.out.println(info);
    }
    public void drive(){
        System.out.println(make + " is driving");
    }
    public void showCurrentSpeed(int speedLimit){
        if(currentSpeed<=speedLimit){
            System.out.println(currentSpeed);
        }else {
            System.out.println("You are dring too fast");
        }
    }
    public void bikeInfo(){
        String info = "Name: " + make;
        System.out.println(info);
    }




}
