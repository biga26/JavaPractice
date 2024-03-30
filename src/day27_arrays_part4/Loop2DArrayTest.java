package day27_arrays_part4;

import java.util.Arrays;

public class Loop2DArrayTest {

    public static void main(String[] args) {

        String[][] pizzas = {


                {"pineapple","pepperoni"},
                {"anchioves","mushroom"},
                {"4 cheese"},
                {"chicken","tomatoes","onions"},
                {"green peppers","zuccini","broccoli","spinach","shrimp"}
        };
        System.out.println(pizzas.length);
        System.out.println(pizzas[0][0]);
        System.out.println(pizzas[1][1]);

        for(String[] pizza : pizzas){
            System.out.print(pizza.length + " - ");
            System.out.println(Arrays.toString(pizza));
        }
        System.out.println("=============================");
        for(int i=0;i< pizzas.length;i++){
            System.out.println(pizzas[i].length);
            System.out.println(Arrays.toString(pizzas[i]));
        }
        System.out.println("===========================");

        for(String value: pizzas[3]){
            System.out.println(value);
        }

        int[][] students = {
                {4,5,6},
                {12,5,7},
                {23,56,12,55,3}
        };

        for(int[] group: students){
            for(int studentID: group){
                System.out.println(studentID);
            }
        }




    }

}
