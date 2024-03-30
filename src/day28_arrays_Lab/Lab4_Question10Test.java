package day28_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question10Test {

    public static void main(String[] args) {

        int[] x  = {2,2,2,2,3};
        int[] y  = {2,3};

        System.out.println(Arrays.toString(double23(x)));


    }
    public static int[] double23(int[] arr){
        int counter2 = 0;
        int counter3 = 0;
        int[] arr2 = new int[2];

        for(int value: arr){
            if(value==2){
                counter2++;
            }else if(value==3){
                counter3++;
            }
        }
        arr2[0] = counter2;
        arr2[1] = counter3;

        return arr2;


    }


}
