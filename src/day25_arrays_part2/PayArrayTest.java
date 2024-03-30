package day25_arrays_part2;

import java.util.Scanner;

public class PayArrayTest {

    public static void main(String[] args) {

        final int EMPLPOYEES = 5;
        double payRate;
        double grossPay;

        Scanner scan = new Scanner(System.in);

        int[] hours = new int[EMPLPOYEES];

        for(int i=0;i<EMPLPOYEES;i++){
            hours[i] = scan.nextInt();
        }

        System.out.println("What is payrate");
        payRate = scan.nextDouble();

        for(int i=0;i<EMPLPOYEES;i++){
            grossPay = hours[i] * payRate;
            System.out.println("employyee #" +(i+1)+": " + grossPay);
        }

    }

}
