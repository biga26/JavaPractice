package day17_classObjects_Part2;

public class BMWTest {

    String model;
    int mileage;
    int year;
    int price;

    public void totalInfo(){
        System.out.println(price);
    }
    public void priceToSell(int year){
        if(year<=2010){
            price = 5000;
        }else {
            price = 10000;
        }
        System.out.println("price is: " + price);
    }








}
