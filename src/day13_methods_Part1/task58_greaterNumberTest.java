package day13_methods_Part1;

public class task58_greaterNumberTest {

    public static void main(String[] args) {

        findGreater(1,50);

    }

    public static void findGreater(int num1, int num2) {

        if(num1>num2){
            System.out.println("num 1 is greater");
        } else if(num2>num1){
            System.out.println("Num 2 is greater");
        }else{
            System.out.println("Numbers are equal");
        }
    }

}
