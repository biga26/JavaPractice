package day33_ClassObjects_Constructors;

public class Car2 {

    String model;
    String make;
    int year;
    double mile;
    String color;

    public Car2(){
        make = "Toyota";
        model = "Camry";
        year = 2003;
        mile = 120000;
        color = "grey";
    }

    public Car2(String model, String make, int year, double mile, String color){
        this.model = model;
        this.make = make;
        this.year = year;
        this.mile = mile;
        this.color = color;
    }

}
