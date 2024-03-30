package day28_arrays_Lab;

public class Lab4_Question4Test {

    public static void main(String[] args) {

        int[] x = {1,2,3};
        int[] y = {-4,2,0};

        int a = sum(x);
        int b = sum(y);
        System.out.println(a);
        System.out.println(b);

    }

    public static int sum(int[] arr){
        int sum = 0;

        for(int value: arr){
            sum = sum + value;
        }
        return sum;
    }


}
