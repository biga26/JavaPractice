package day25_arrays_part2;

import java.util.Scanner;

public class PassArrayTest {

    public static void main(String[] args) {

        

        int[] numbers = new int[4];
        getValues(numbers);
        showValues(numbers);



    }

    public static void getValues(int[] array){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a series of " + array.length + " numbers");

        for(int i=0; i< array.length; i++){
            System.out.println("Enter number: " + (i+1));
            array[i] = scan.nextInt();
        }

    }

    public static void showValues(int[] array){
        for(int value: array){
            System.out.println(value);
        }
    }


}
