package day05_unary_assignment_relational_operators;

public class Task19_IncrementDecrementTest {
    public static void main(String[] args) {

        int a = 50;
        int result = --a + a++ + a-- + a++;
        //a in memory

        System.out.println(a);
        System.out.println(result);


    }
}
