package day27_arrays_part4;

import java.util.Arrays;

public class ArrayClassTest {

    public static void main(String[] args) {

        int[] nums = {43,12,4,1,3,5};
        System.out.println(Arrays.toString(nums));

        int[] nums1 = {4,5,6,10,1000};
        int[] nums2 = {4,5,6,10,1000};
        System.out.println(Arrays.equals(nums1, nums2));

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        String[] languages = {"zulu","SPanish","Italian","English","Polish"};
        Arrays.sort(languages);
        System.out.println(Arrays.toString(languages));

        int[] numx = {4,6,7,10,55};
        System.out.println(Arrays.binarySearch(numx,7));
        System.out.println(Arrays.binarySearch(numx,55));
        System.out.println(Arrays.binarySearch(numx,10));







    }

}
