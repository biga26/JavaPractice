package day04_arithmetic_operators;

public class ArtihmeticOperatorsTest {
    public static void main(String[] args) {

        //addition operatot
        int chairs=140;
        System.out.println(chairs);
        System.out.println(chairs+2);

        int moreChairs=chairs+5;
        System.out.println(moreChairs);

        int tables=130;
        int total=tables+chairs;
        System.out.println(total);

        //subtraction
        double balance = 1200.48;
        double transaction = 56.44;
        System.out.println(balance-transaction);
        balance=balance-transaction;
        System.out.println(balance);

        int linesOfCode=50;
        System.out.println("Lines of code "+linesOfCode);

        linesOfCode=linesOfCode-2;
        System.out.println("Lines of code "+linesOfCode);

        int classes = 5;
        System.out.println(linesOfCode*classes);
        int totalLinesOfCode= linesOfCode * classes;
        System.out.println("Total lines of code" +totalLinesOfCode);

        System.out.println(60/5);
        System.out.println(11*0);

        //Reminder
        System.out.println(10%2);
        System.out.println(9%2);;

    }
}
