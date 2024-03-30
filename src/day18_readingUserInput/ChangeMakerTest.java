package day18_readingUserInput;
import java.util.Scanner;

public class ChangeMakerTest {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1-99");
        int attempt = 0;

        do{
            int user_amount = scan.nextInt();
            if(user_amount>1 && user_amount<100){
                changeMaker(user_amount);
                break;
            }


        }while(true);

        



    }

    public static void changeMaker(int amount){

        int originalAmount = amount;

        int quarters = amount/25;
        amount = amount%25;
        int dimes = amount/10;
        amount = amount%10;
        int nickles = amount/5;
        amount = amount%5;
        int pennies = amount;

        System.out.println(originalAmount + " total cents");
        System.out.println("quarters: "+ quarters);
        System.out.println("dimes: " + dimes);
        System.out.println("nickles: " + nickles);
        System.out.println("pennies: " + pennies);
    }




}
