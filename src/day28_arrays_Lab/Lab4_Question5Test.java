package day28_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question5Test {

    public static void main(String[] args) {

        int[] x = {17,12,10,8};
        System.out.println(Arrays.toString(x));
        System.out.println(x.length);
        System.out.println(Arrays.toString(rotateLeft(x)));

    }

    public static int[] rotateLeft(int[] arr){

        int x = arr[0];

        for(int i=0; i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = x;

        return arr;
    }


}
