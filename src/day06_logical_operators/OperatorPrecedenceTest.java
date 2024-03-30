package day06_logical_operators;

public class OperatorPrecedenceTest {

    public static void main(String[] args) {

        int applesCount = 10;
        int orangesCount = 20;
        int pearsCount = 30;

        boolean comp = applesCount > orangesCount || orangesCount > pearsCount;

        System.out.println("Check");
        System.out.println(comp);

        System.out.println("*********************");

    }

}
