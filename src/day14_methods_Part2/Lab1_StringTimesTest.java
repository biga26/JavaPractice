package day14_methods_Part2;

public class Lab1_StringTimesTest {

    public static void main(String[] args) {
        stringTimes("Hi", 5);

    }

    public static void stringTimes(String string, int num) {

        String str = "";

        for(int i=0; i<num; i++){
            str = str + string;
        }
        System.out.println(str);
    }

}
