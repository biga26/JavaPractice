package day14_methods_Part2;

public class ValueReturnTest {

    public static void main(String[] args) {
        int x = sum(2,3);
        System.out.println(x);
    }

    public static int sum(int num1, int num2){
        int result;
        result = num1 + num2;
        return result;
    }

}
