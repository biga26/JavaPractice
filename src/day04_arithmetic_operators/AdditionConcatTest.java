package day04_arithmetic_operators;

public class AdditionConcatTest {
    public static void main(String[] args) {
        System.out.println(2+2);
        System.out.println(20+200);

        //number + string: concatenation
        System.out.println(5 + "hello");

        //string + boolean: concatenation
        System.out.println("hello" + true);

        //string + string : concatenation
        System.out.println("Hello" + "World");

        //boolean + number

        System.out.println(2+0+5+"Cybertek");//7cybertek
        System.out.println("cybertek"+2+5+6);//cybertek256
        System.out.println(2+3+4+"Cybertek"+2+0+5);//9Cybertek205
        System.out.println(2+0+5+"cybertek"+(2+0+1));


    }
}
