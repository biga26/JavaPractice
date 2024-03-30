package day19_stringManipulation_part1;

public class String_CharAtTest {

    public static void main(String[] args) {

        String word = "Computer";

        System.out.println(word.length());

        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));


        String word2 = "apple";

        if(word2.charAt(2)=='A'){
            System.out.println("A is first letter");
        }else{
            System.out.println("A is not first letter");
        }


        //

        String word3 = "civic";

        char first = word3.charAt(0);
        char last = word3.charAt(1);

        if(first==last){
            System.out.println("first and last match");
        }else {
            System.out.println("First and last no match");
        }


        //
        String word4 = "Java Script";
        char lastChar = word4.charAt(word4.length()-1);
        System.out.println("Last char of " + word4 + " is " + lastChar);







    }

}
