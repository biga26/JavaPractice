package day18_readingUserInput;
import java.util.Scanner;
public class UserInput3Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1st number");
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd number ");
        int num2 = sc.nextInt();
        System.out.println(num2);

        System.out.println("enter string");
        String str = sc.nextLine();

        System.out.println("Output" + num1 + ":" + num2);



    }

}
