package day27_arrays_part4;

public class Lab4_Question1Test {

    public static void main(String[] args) {

        int[] x = {1,2,6};
        int[] y = {6,1,2,3};
        int[] z = {13,6,1,2,3};
        int[] k = {1};

        System.out.println();

    }

    public static boolean firstLast6(int[] arr){
        if(arr.length<1){
            return false;
        }
        if(arr[0]==6 || arr[arr.length-1]==6){
            return true;
        }else{
            return false;
        }
    }


}
