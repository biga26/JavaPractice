package day15_methods_Part3;

public class MethodOverloading2Test {

    public static void main(String[] args) {
        System.out.println(method1(1,2));
    }

    public static int method1(int num1, int num2){
        return 5;
    }
    public static double method1(int num1, float num2){
        return 5.2;
    }

}
