package day31_arrayList;

import java.util.ArrayList;

public class ArrayListIntroTest {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();

        names.add("Mike");
        names.add("John");
        names.add("Emmy");
        names.add("Evan");

        nums.add(99);
        nums.add(656);
        nums.add(100);
        nums.add(new Integer("100"));

        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));

        System.out.println("Names count: " + names.size());
        System.out.println(names.toString());



    }

}
