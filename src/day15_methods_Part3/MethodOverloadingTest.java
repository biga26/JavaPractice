package day15_methods_Part3;

public class MethodOverloadingTest {

    public static void main(String[] args) {

        int num = sum(10,20,30,40);
        System.out.println(num);

        System.out.println(sum(1,2));

    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return  a+b+c;
    }

    public static int sum(int a, int b, int c, int  d){
        return a+b+c+d;
    }

    public static int sum(int a, int b, int c, int d, int e){
        return a+b+c+d+e;
    }

}
