package aaa;

import java.util.ArrayList;
import java.util.Arrays;

public class Garbage {

    public static void main(String[] args) {

        Boolean b1 = true;
        b1 = null;

        System.out.println(b1);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));

        System.out.println(list);

        list = new ArrayList<>();


    }

}
