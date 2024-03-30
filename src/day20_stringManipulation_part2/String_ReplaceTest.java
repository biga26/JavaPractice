package day20_stringManipulation_part2;

public class String_ReplaceTest {


    public static void main(String[] args) {

        String str = "Ashgabat is capital of Turkmenistan";

        str = str.replace("Ashgabat","Baku").replace("Turkmenistan","Azerbaijan");
        System.out.println(str);

        String email = "biga@gmail.com";
        String company = "awtoline";

        email = email.replace("gmail",company);
        System.out.println(email);


    }



}
