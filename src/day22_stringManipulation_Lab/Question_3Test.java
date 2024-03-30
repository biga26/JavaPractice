package day22_stringManipulation_Lab;

public class Question_3Test {

    public static void main(String[] args) {

        System.out.println(extraEnd("123456789"));

    }

    public static String extraEnd(String str){

        if(str.length()<2){
            return "Invalid String";
        }

        String dummy = "";
        dummy = str.substring(str.length()-2);

        return dummy;



    }

}
