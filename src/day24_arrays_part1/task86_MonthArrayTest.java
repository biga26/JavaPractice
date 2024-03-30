package day24_arrays_part1;

import java.util.Scanner;

public class task86_MonthArrayTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] myArray = new String[12];

        myArray[0] = "jan";
        myArray[1] = "Feb";
        myArray[2] = "Mar";
        myArray[3] = "Apr";
        myArray[4] = "May";

        System.out.println("Enter your month index number");
        int index = scan.nextInt();

        System.out.println("The month is " + myArray[index]);
        System.out.println(myArray);


       

        


    }

}
