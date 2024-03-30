package day22_stringManipulation_Lab;

public class Question_4Test {

    public static void main(String[] args) {

        System.out.println(firstTwo("Ashgabat"));

    }

    public static String firstTwo(String str){

        if(str.length()<2){
            return str;
        } else if(str.isEmpty()) {
            return "";
        }else {
            return str.substring(0,2);
        }

    }

}
