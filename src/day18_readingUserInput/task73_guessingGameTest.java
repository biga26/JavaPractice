package day18_readingUserInput;
import java.util.Scanner;

public class task73_guessingGameTest {

    public static void main(String[] args) {

        int userInput;
        int secretNumber = 8;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number");

        do{
            userInput = scan.nextInt();
            if(userInput<secretNumber){
                System.out.println("enter bigger number");
            }else if(userInput>secretNumber){
                System.out.println("enter smaller number");
            }else {
                System.out.println("Correct. Secret number is: " +userInput);
            }
        }while(userInput!=secretNumber);


    }

}
