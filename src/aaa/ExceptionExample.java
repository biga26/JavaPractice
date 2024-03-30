package aaa;

import java.util.SortedMap;

public class ExceptionExample {

    public static void main(String[] args) {

        String r1 = null;

        //System.out.println(r1.toLowerCase());


        //NullPointerException:
        String name = null;
        //System.out.println(name.length());



        //IllegalArgumentException:
        int age = -5;

        /*
        if(age<0){
            throw new IllegalArgumentException("Age must be greater than zero");
        }
        System.out.println(age);

        */


        /*
        //ArrayIndexOutOfBoundsException
        int[] numbers = {1, 2, 3};
        for(int i=0; i< numbers.length+1; i++){
            System.out.println(numbers[i]);
        }
        */


        /*
        //ArithmeticException:  arithmetic operation fails
        int result = 10/0;
        System.out.println(result);
        */



        /*
        // ClassCastException: 	Object obj = new Integer(10); and then trying to cast obj to a String.
        Object obj = new String("Hello");
        System.out.println((Integer) obj);
        */




        /*
        //IOException: trying to parse a non-numeric string into an integer
        int number = Integer.parseInt("abc");
         */
















    }
}