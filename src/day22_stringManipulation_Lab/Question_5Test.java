package day22_stringManipulation_Lab;

public class Question_5Test {

    public static void main(String[] args) {

        System.out.println(firstHalf("Ashgabat"));

    }

    public static String firstHalf(String str){

        int x = str.length()/2;

        return str.substring(0,x);

    }


}
