package day18_readingUserInput;
import java.util.Scanner;

public class UserInput2Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Provide a sentenced and I will repeat it");

        String str2 = sc.nextLine();
        System.out.println(str2);

    }

}
