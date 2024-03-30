package day23_stringManipulationLab_randomClasss;

import java.util.Random;

public class RandomNumbersTest {

    public static void main(String[] args) {

        Random rn = new Random();
        System.out.println(rn.nextInt());
        System.out.println(rn.nextBoolean());
        System.out.println(rn.nextDouble());

        System.out.println(rn.nextInt(2)+50);


    }

}
