package day21_stringManipulation_part3;

public class String_SubStringTest {

    public static void main(String[] args) {

        String sentence = "Java String Manipulation is fun!";

        System.out.println(sentence.substring(2));
        System.out.println(sentence.substring(5,11));
        System.out.println(sentence.length());
        System.out.println(sentence.substring(5,sentence.length()-5));

        String chars = "{{}}";
        String word = "AUTOMATION";

        String result = chars.substring(0,2) + word + chars.substring(2);

        System.out.println("--------------------------------------");
        System.out.println(word.toLowerCase());

    }

}
