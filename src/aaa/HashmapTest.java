package aaa;

import java.util.HashMap;

public class HashmapTest {

    public static void main(String[] args) {


        // Create a HashMap object called capitalCities
        HashMap<String,String> capitalCities = new HashMap<String,String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        ;
        System.out.println(capitalCities.get("England"));

        capitalCities.clear(); // to remove all hasmap 
        System.out.println(capitalCities);






    }
}
