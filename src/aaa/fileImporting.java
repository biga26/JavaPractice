package aaa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Properties;
import java.util.Scanner;

public class fileImporting {

    public static void main(String[] args) throws Exception {



        /*

        //read file with BufferedReader
        // one of the way to read file witout using any external library
        FileReader file1 =  new FileReader("TextFile.txt");
        BufferedReader read = new BufferedReader(file1);

        //below syntax reads each line seperately
        System.out.println(read.readLine());
        System.out.println(read.readLine());

        */

        System.out.println("====================================");

        //read file through Scanner

        Scanner scan = new Scanner(new FileReader("TextFile.txt"));

        while (scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }

        System.out.println("=================================");


        //method to write to file
        FileWriter file2 = new FileWriter("TextFileWrite.txt");

        BufferedWriter writer = new BufferedWriter(file2);

        writer.write("What is ur name?");
        writer.write("\nMy name is Begench");
        writer.close();


        ArrayList<String> list =
                new ArrayList<String>();
        list.add("code");
        list.add("code");
        list.add("quiz");
        list.add("code");

        // count the frequency of the word "code"
        System.out.println("The frequency of the word code is: "+
                Collections.frequency(list, "code"));




    }

}
