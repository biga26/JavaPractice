package day29_arrays_Lab;

public class Lab4_Question16Test {

    public static void main(String[] args) {

        int[] x = {2,1,2,3,7};
        System.out.println(countEvens(x));
        System.out.println(countOdd(x));

    }
    public static int countEvens(int[] arr){

        int counter = 0;

        for(int i=0; i<arr.length;i++){
            if(arr[i]%2==0){
                counter++;
            }
        }
        return counter;
    }
    public static int countOdd(int[] arr){
        int counter = 0;
        for(int value: arr){
            if(value%2!=0){
                counter++;
            }
        }
        return counter;
    }





}
