package day15_methods_Part3;

public class task67_LastDigitTest {

    public static void main(String[] args) {

        if(lastDigit(5,555)){
            System.out.println("They have the same last digit");
        }else{
            System.out.println("They do not have same last digit");
        }

    }

    public static boolean lastDigit(int num1, int num2){
        if((num1%10)==(num2%10)){
            return true;
        }else {
            return false;
        }
    }

}
