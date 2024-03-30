package day22_stringManipulation_Lab;

public class Question_6Test {


    public static void main(String[] args) {

        System.out.println(withoutEnd("Hello"));

    }


    public static String withoutEnd(String str){
        if(str.length()<2){
            return "Invalid string";
        }
        return str.substring(1,str.length()-1);
    }


}
