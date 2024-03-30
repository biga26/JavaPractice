package day19_stringManipulation_part1;
import java.util.Scanner;
import day01_hello_world.Main;

public class task76_PrintingEachCharacterTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        System.out.println(text);

        for(int i=0; i<text.length(); i++){
            System.out.println(text.charAt(i));
        }


    }

}
