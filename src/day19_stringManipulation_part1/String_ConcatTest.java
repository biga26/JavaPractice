package day19_stringManipulation_part1;

public class String_ConcatTest {

    public static void main(String[] args) {

        String word = "Java";

        System.out.println(word.concat("+selenium"));
        System.out.println(word.concat(" in eclipse"));

        System.out.println(word);

        word = word.concat("+Eclipse");
        System.out.println(word);

        word = word.concat(" Automation");
        System.out.println(word);

        word = word + 123;
        System.out.println(word);

        String word2 = "Hi";
        word2 = word2.concat("-hey").concat("-how are you").concat("-good");
        System.out.println(word2);


    }

}
