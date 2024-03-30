package day26_arrays_part3;

public class StringMan_ArraysTest {

    public static void main(String[] args) {

        String[] myCars = {"Honda","Mercedes","BMW","Toyota","Ford"};

        System.out.println(myCars[0].length());
        System.out.println(myCars[1].charAt(2));
        System.out.println(myCars[2].substring(2,3));
        System.out.println(myCars[3].trim());
        System.out.println(myCars[4]);
        System.out.println(myCars[4].equals(myCars[0]));
        System.out.println(myCars[0]==myCars[2]);

        for(int i=0;i<myCars.length;i++){
            System.out.println(myCars[i].length());
        }
        System.out.println("========================================");

        String str = "It will display the array of the size";
        String[] arr = str.split(" ");

        System.out.println(arr.length);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }



    }

}
