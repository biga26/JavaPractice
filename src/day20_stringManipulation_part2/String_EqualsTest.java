package day20_stringManipulation_part2;

public class String_EqualsTest {

    public static void main(String[] args) {

        String s1 = "Welcome to Java";
        String s2 = "Welcome to Java";
        String s3 = "Welcome to C++";

        boolean b1 = s1.equals(s2);
        boolean b2 = s1 == s2;
        System.out.println(b1);
        System.out.println(b2);

    }

}
