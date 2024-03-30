package day32_arrayList_part2;

import java.util.ArrayList;

public class CustomMethodsTest {

    public static void main(String[] args) {

        ArrayList<Integer> numsList = new ArrayList<>();
        numsList.add(10);
        numsList.add(10);
        numsList.add(7);
        numsList.add(8);


        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(10.220);
        doubleList.add(15.55);
        doubleList.add(3.45);
        doubleList.add(4.98);


    }
    public static double sumList(ArrayList<Double> dlist){

        double sum = 0;
        for(Double d: dlist){
            sum=sum+d;
        }
        return sum;
    }



}
