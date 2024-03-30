package day26_arrays_part3;

import java.util.Arrays;

public class task94_SearchResultTest {

    public static void main(String[] args) {

        String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
        String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";

        String[] infoArray1 = info1.split("password ");
        String[] infoArray2 = info2.split("password ");
        System.out.println(infoArray1);
        System.out.println(infoArray2);

        System.out.println(Arrays.toString(infoArray1));
        System.out.println(infoArray1.length);
        System.out.println(infoArray1[0]);
        System.out.println(infoArray1[1]);

        String pass1 = infoArray1[1].split(". Please")[0];

        System.out.println(pass1);






    }

}
