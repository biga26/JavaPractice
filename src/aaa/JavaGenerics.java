package aaa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaGenerics {

    public static void main(String[] args) {


        List l1 = new ArrayList();
        l1.add(Arrays.asList(1,"A","C", false));

        System.out.println(l1);
        System.out.println(l1.get(2));




    }

}
