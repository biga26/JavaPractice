package day17_classObjects_Part2;

public class CarObjectsTest {

    public static void main(String[] args) {

        BMWTest car1 = new BMWTest();

        car1.model = "X5";
        car1.mileage = 102000;
        car1.year = 2015;

        car1.priceToSell(2015);
        car1.totalInfo();



    }

}
