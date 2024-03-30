package aaa;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

public class JavaReviewMethods {


    public static void main(String[] args) {




    }


    // 1. How to convert integer to string ; explain verbly !
    public static void convertString(String str){
        int a = Integer.parseInt(str);
        System.out.println(a);
    }

    public static void convertInteger(int n){
        String str = String.valueOf(n);
        System.out.println(str);
    }


    public static void Fibonacci(int n){

        int num1 = 0;
        int num2 = 1;

        for(int i=0; i<n; i++){
            System.out.print(" " + num1);

            int num3 = num2 + num1;

            num1 = num2;
            num2 = num3;

        }

    }


    //Write java program to check to check is number prime or not
    public static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }

    //Swap Numbers
    public static void swapNumbers(int num1, int num2){


        int temp;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(num1 + " " + num2);



    }


    public static void swapNumbers2(int num1, int num2){

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
    }

    public static void reverseString(String str){
        String reverse = "";
        for(int i=str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
    }


    //not finished
    public static void reverseArray(int[] array){

        int[] reverse = new int[array.length];
        int l = array.length;

        for(int i=0; i<array.length; i++){
            reverse[l-1] = array[i];
            l = l-1;
        }
        System.out.println(Arrays.toString(reverse));
    }

    public static void factorial(int num){
        int factorial = 1;
        for(int i=1; i<=num; i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }


    //not ready
    /*
    public static void sumOfDigits(int num){

        int total = 0;
        int m;

        for(int i=10; i>0; i=i*10){



            if(num%i=m){
                total = total + m;
            }
        }
        System.out.println(m);


    }

     */


    public static void sum(int a, int b){

        int result = a + b;
        System.out.println(result);
    }

    public static void sum(int a, int b, int c){

        int result = a + b + c;
        System.out.println(result);
    }




    public static int calculateAge(int birthYear, int currentYear){

        int age = currentYear - birthYear;
        return age;
    }


    















}
