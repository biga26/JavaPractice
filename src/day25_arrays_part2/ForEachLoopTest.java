package day25_arrays_part2;

public class ForEachLoopTest {

    public static void main(String[] args) {

        String[] products = {"Timberland","Shirt","Watch","Bag","SHoes"};
        double[] prices = {120,12,300,25,67};

        for(int i=0; i<products.length; i++){
            System.out.println(products[i]);
        }
        System.out.println("---------------------------------------");

        for(String prod: products){
            System.out.println(prod);
        }
        System.out.println("========================================");

        for(double pr: prices){
            System.out.println(pr);
        }

        for(int i=products.length-1; i>=0; i--){
            System.out.println(products[i]);
        }

    }

}
