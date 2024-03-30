package day25_arrays_part2;

import java.util.Random;

public class task91_RandomArrayNumbersTest {

    public static void main(String[] args) {

        Random rn = new Random();

        int[] numbers = new int[10];

        for(int i=0; i< numbers.length; i++){
            numbers[i] = rn.nextInt(100);
        }

        for(int value: numbers){
            System.out.println(value);
        }



    }

}
