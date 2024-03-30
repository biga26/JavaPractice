package aaa;

public class StringBuilder {

    public static void main(String[] args) {


        //Immutable
        String s1 = new String("A");


        //mutable versions r String
        java.lang.StringBuilder s2 = new java.lang.StringBuilder("B");
        StringBuffer s3 = new StringBuffer("C"); // synchronized

        System.out.println(s2);




    }
}
