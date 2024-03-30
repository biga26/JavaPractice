package day28_arrays_Lab;

public class Lab4_Question8Test {

    public static void main(String[] args) {

        int[] x = {4,5};
        int[] y = {6,2};
        int[] z = {8,1};

        System.out.println(has23(y));


    }
    public static boolean has23(int[] arr){

        for(int value: arr){
            if(value==2 || value==3){
                return true;
            }
        }
        return false;
    }


}
