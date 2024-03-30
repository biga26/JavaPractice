package day19_stringManipulation_part1;
import java.util.Scanner;
public class task75_TotalCharactersTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String name = scan.nextLine();

        System.out.println("Enter your last name:");
        String lastName = scan.nextLine();

        System.out.println("Total characters of first name: " + name.length());
        System.out.println("COunt of lastName: " + lastName.length());

    }

}
