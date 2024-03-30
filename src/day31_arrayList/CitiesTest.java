package day31_arrayList;

import java.util.ArrayList;

public class CitiesTest {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("London");
        cities.add("Virginia");
        cities.add("DC");
        cities.add("Baku");
        cities.add("Berlin");
        cities.add("Baku");

        System.out.println(cities.toString());

        for(String city: cities){
            System.out.println(city);
        }

        System.out.println("==============================");

        for(int i=0;i<cities.size();i++){
            System.out.println(cities.get(i));
        }

        System.out.println("Removing Baku");
        cities.remove("Baku");
        cities.remove("Baku");
        System.out.println(cities);

        cities.add("Mary");
        System.out.println(cities.toString());

        cities.clear();
        System.out.println(cities.toString());


    }

}
