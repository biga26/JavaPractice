package day23_stringManipulationLab_randomClasss;

import java.util.Random;
import java.util.Scanner;

public class MathTutorTest {

    public static void main(String[] args) {

        int num1;
        int num2;
        int sum;
        int userAnswer;

        Scanner scan = new Scanner(System.in);
        Random rn = new Random();

        num1 = rn.nextInt(100);
        num2 = rn.nextInt(100);
        sum = num1 + num2;

        userAnswer = scan.nextInt();

        if(userAnswer==sum){
            System.out.println("correct");
        }else {
            System.out.println("Try again: " + sum);
        }


    }

}
