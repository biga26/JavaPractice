package day31_arrayList;

import java.util.ArrayList;

public class ArrayListExampleTest {

    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("English");
        languages.add("Arabic");
        languages.add("Turkish");

        System.out.println(languages);
        System.out.println(languages.size());

        languages.add("Russian");
        System.out.println(languages.toString());

        languages.remove(0);
        System.out.println(languages);

        System.out.println(languages.size());


    }

}
