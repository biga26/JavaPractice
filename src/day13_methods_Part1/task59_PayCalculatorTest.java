package day13_methods_Part1;

public class task59_PayCalculatorTest {

    public static void main(String[] args) {

        payCalculator(10,300);

    }

    public static void payCalculator(double hours, double hourlyPay) {

        double pay = hours * hourlyPay;
        System.out.println(pay);
    }

}
