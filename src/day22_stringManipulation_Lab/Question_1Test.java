package day22_stringManipulation_Lab;

public class Question_1Test {

    public static void main(String[] args) {

        System.out.println(helloName("Biga"));

    }

    public static String helloName(String str){

        return "Hello ".concat(str).concat(":");
    }

}
