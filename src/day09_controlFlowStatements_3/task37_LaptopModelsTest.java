package day09_controlFlowStatements_3;

public class task37_LaptopModelsTest {

    public static void main(String[] args) {

        String computer = "Apple";

        switch(computer){
            case "Apple":
                System.out.println("No virus");
                break;
            case "Dell":
                System.out.println("Tough one");
                break;
            case "Acer":
                System.out.println("Not recommended");
            default:
                System.out.println("Do not buy that one");
        }

    }

}
