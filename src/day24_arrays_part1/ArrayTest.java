package day24_arrays_part1;

public class ArrayTest {

    public static void main(String[] args) {

        int[] myList = {10,20,30};

        String[] myArray = {"Apple", "Orange","Watermelon"};

        System.out.println(myList[1]);
        System.out.println(myArray[2]);

        System.out.println(myList.length);

        for(int i=0; i<myList.length; i++){
            System.out.println(myList[i]);
        }
        for(int i=0; i<myArray.length; i++){
            System.out.println(myArray[i]);
        }

        int[] scores = {10,20,30,40,50,60,70,80,90,10,20};

        int sum = 0;

        for(int i=0; i<scores.length; i++){
            sum = sum + scores[i];
        }
        System.out.println(sum);
        System.out.println(sum/scores.length);




    }

}
