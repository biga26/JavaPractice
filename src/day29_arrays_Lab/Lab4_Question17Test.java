package day29_arrays_Lab;

public class Lab4_Question17Test {

    public static void main(String[] args) {

        int[] x = {1,2,3,4,5,6};
        System.out.println(difference(x));
    }
    public static int difference(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int j=0; j<arr.length;j++){
            if(arr[j]<min){
                min = arr[j];
            }
        }
        return max-min;
    }



}
