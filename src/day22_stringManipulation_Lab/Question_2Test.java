package day22_stringManipulation_Lab;

public class Question_2Test {
    public static void main(String[] args) {

        System.out.println(makeAbba("AB","BA"));
        System.out.println(makeAbba("Bi","GA"));




    }

    public static String makeAbba(String str1, String str2){

        return str1 + str2 + str2 + str1;
    }


}
