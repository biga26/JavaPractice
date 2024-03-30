package day16_classObejcts;

public class BestbuyTest {

    public static void main(String[] args) {

        CellPhoneTest d1 = new CellPhoneTest();
        d1.brand = "Samsung";
        d1.screenSize = 54;
        d1.color = "black";
        d1.price = 1000;

        System.out.println(d1.brand);

        d1.turnON();
        d1.channel();
        d1.turnOff();

        d1.color = "White";
        System.out.println(d1.color);

        CellPhoneTest d2 = new CellPhoneTest();
        d2.brand = "Hisense";
        d2.screenSize = 100;
        d2.color = "silver";
        d2.price = 2999;
        System.out.println(d2.brand);







    }

}
