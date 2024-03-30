package day24_arrays_part1;

import java.util.Scanner;

public class task87_DayArrayTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] days = new String[7];

        days[0] = "monday";
        days[1] = "tuesday";
        days[2] = "wednesday";

        System.out.println("Enter ur day index");

        int index = scan.nextInt();
        System.out.println(days[index]);



    }

}
