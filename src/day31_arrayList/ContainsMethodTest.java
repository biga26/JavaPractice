package day31_arrayList;

import java.util.ArrayList;

public class ContainsMethodTest {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Jan");
        list1.add("Feb");
        list1.add("Mar");
        list1.add("Apr");

        System.out.println(list1.toString());

        ArrayList<String> list2 = list1;

        System.out.println(list2);

        //copy all values from list1
        ArrayList<String> months = new ArrayList<String>(list1);
        months.add("May");
        months.add("Jun");
        months.add("Jul");
        System.out.println(months);

        System.out.println(months.contains("Jan"));

        //how to check if Feb is in second position
        System.out.println(months.indexOf("Feb")==1);
        System.out.println(months.get(1).equals("Feb"));






    }

}
