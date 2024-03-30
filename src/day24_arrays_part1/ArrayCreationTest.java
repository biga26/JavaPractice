package day24_arrays_part1;

public class ArrayCreationTest {

    public static void main(String[] args) {

        int score1 = 80;
        int score2 = 85;
        int score3 = 90;
        int score4 = 100;
        int score5 = 85;

        int[] scores = new int[5];

        scores[0] = score1;
        scores[1] = score2;
        System.out.println(scores[0]);
        System.out.println(scores[1]);

        int sum = score1 + score2 + score3 + score4;
        System.out.println(sum);

    }

}
