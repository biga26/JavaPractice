package day31_arrayList;

import java.util.ArrayList;

public class ShoppingListTest {

    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("paper towel");
        shoppingList.add("dish soap");
        shoppingList.add("trash bag");
        shoppingList.add("clorox");

        //print numbers of items
        int count = shoppingList.size();
        System.out.println(count);

        //print numbers on single line
        System.out.println(shoppingList);
        System.out.println(shoppingList.toString());

        System.out.println(shoppingList.get(0) + "   " + shoppingList.get(count-1));
        shoppingList.remove("paper towel");
        System.out.println(shoppingList);

        System.out.println("==========================================");

        // print each item
        for(String item: shoppingList){
            System.out.println(item);
        }

        //remove all items at once
        shoppingList.clear();
        System.out.println(shoppingList);




    }

}
