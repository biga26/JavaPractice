package day13_methods_Part1;

public class DeepAndDeeperTest {

    public static void main(String[] args) {

        System.out.println("I am starting in main");
        deep();

    }

    public static void deep() {
        System.out.println("Deep method");
        deeper();
    }

    public static void deeper() {
        System.out.println("Deeper method");
    }

}
