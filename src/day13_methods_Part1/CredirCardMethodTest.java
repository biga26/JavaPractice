package day13_methods_Part1;

public class CredirCardMethodTest {

    public static void main(String[] args) {

        double salary = 50000;
        int creditRating = 8;

        if(salary>=20000 && creditRating>=7){
            qualify();
        }else {
            noQualify();
        }

    }

    public static void noQualify() {
        System.out.println("I am sorry, you are not qualified for the CC");
    }

    public static void qualify() {
        System.out.println("Congrats, you are qualified for the CC");
    }



}
