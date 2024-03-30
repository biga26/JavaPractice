package day19_stringManipulation_part1;

public class task78_CountHowManyTest {


    public static void main(String[] args) {

        String str = "abcdefghij";
        char myChar = 'c';

        int counter = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==myChar){
                System.out.println("Letter count is:" + (i+1));
            }

        }


    }

}
