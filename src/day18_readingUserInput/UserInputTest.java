package day18_readingUserInput;
import java.util.Scanner;
public class UserInputTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a byte value");
        byte b1= sc.nextByte();
        System.out.println("Best is" + b1);

        System.out.println("Enter short value");
        short s1 = sc.nextShort();
        System.out.println("SHort is " +s1);

        System.out.println("Enter integer");
        int i1 = sc.nextInt();
        System.out.println("Integer is " + i1);

        System.out.println("Enter boolean");
        boolean bool1 = sc.nextBoolean();
        System.out.println("Boolean is " + bool1);



    }

}
