package day28_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question14Test {

    public static void main(String[] args) {

        int[] x = {1,2};
        int[] y = {3,4,5,6,7};

        System.out.println(Arrays.toString(mix2(x,y)));

    }

    public static int[] mix2(int[] arr1, int[] arr2){

        int[] mix = new int[arr1.length+arr2.length];

        for(int i=0; i<arr1.length;i++){
            mix[i] = arr1[i];
        }
        for(int j=0;j<arr2.length;j++){
            mix[arr1.length+j] = arr2[j];
        }
        return mix;

    }

}
