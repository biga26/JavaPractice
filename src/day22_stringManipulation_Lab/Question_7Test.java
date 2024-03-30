package day22_stringManipulation_Lab;

public class Question_7Test {

    public static void main(String[] args) {


        System.out.println(comboString("Muha", "Cmoasdas"));

    }

    public static String comboString(String str1, String str2){

        String combo;

        if(str1.length()>str2.length()){
            combo = str1.concat(str2);
        }else {
            combo = str2.concat(str1);
        }

        return combo;

    }



}
