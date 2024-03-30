package day24_arrays_part1;

import java.util.Random;
import java.util.Scanner;

public class task88_CarPriceTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Random rn = new Random();

        int price = 0;

        String[] car = new String[5];
        car[0] = "Honda";
        car[1] = "BMW";
        car[2] = "Toyota";

        System.out.println("Enter car number");
        int indexCar = scan.nextInt();
        String selcetedCar = car[indexCar];




    }

}
