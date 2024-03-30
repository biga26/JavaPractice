package day19_stringManipulation_part1;

public class String_ContainsTest {

    public static void main(String[] args) {

        String email = "test@gmail.com";
        System.out.println(email.contains("@"));

        String list = "potatoes,tomatoes,eggs,milk, bread,cereal,meat,apples";

        if(list.contains("apples")){
            System.out.println("Apples are in your list");
        }else{
            System.out.println("Apples are not in your list");
        }

        boolean hasEggs = list.contains("eggs");
        System.out.println("Contains:" + hasEggs);

        boolean hasCucumbers = list.contains("cucumber");
        System.out.println("COntains cucumbers: " + hasCucumbers);

        email = "name@yahoo.com";

        if(email.contains("yahoo")){
            System.out.println("Yahoo account");
        } else if(email.contains("gmail")){
            System.out.println("Gmail account");
        }else{
            System.out.println("Hotmail account");
        }

        String etsyTitle = "Car | Etsy";
        if(etsyTitle.contains(" | ")){
            System.out.println("Pipe is there as expected");
        }else {
            System.out.println("Pipe is not detected");
        }

        if(etsyTitle.contains("Car")){
            System.out.println("contains");
        }



    }

}
