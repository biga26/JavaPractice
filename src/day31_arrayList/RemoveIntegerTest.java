package day31_arrayList;

import java.util.ArrayList;

public class RemoveIntegerTest {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        System.out.println(nums.size());
        System.out.println(nums.isEmpty());
        System.out.println(nums.size()==0);

        nums.add(4);
        nums.add(1);
        nums.add(44);

        System.out.println(nums.toString());

        nums.remove(0);
        System.out.println(nums);


    }

}
