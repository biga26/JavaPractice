package day24_arrays_part1;

public class task90_FindingCarTest {

    public static void main(String[] args) {

        String[] cars = {"Toyota", "BMW","Honda"};

        boolean flag = false;
        String selectedCar = "";

        for(int i=0; i<cars.length; i++){
            if(cars[i].equals("Honda")){
                flag=true;
                selectedCar = cars[i];
                System.out.println(selectedCar);
                break;
            }
        }



        if(flag){
            System.out.println("Found it: " + selectedCar );
        }

    }

}
