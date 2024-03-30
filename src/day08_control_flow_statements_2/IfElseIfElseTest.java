package day08_control_flow_statements_2;

public class IfElseIfElseTest {

    public static void main(String[] args) {
        //Program to display days
        //1-Monday
        //2-Tuesday
        //3-Wednesday
        //4-Thursday
        //5-Friday
        //6-Saturday
        //7-Sunday

        int day = 3;

        if(day==1){
            System.out.println("Monday");
        }else if(day==2){
            System.out.println("Tuesday");
        }else if(day==3){
            System.out.println("Wednesday");
        }else if(day==4){
            System.out.println("Thursday");
        }else if(day==5){
            System.out.println("Friday");
        }else if(day==6){
            System.out.println("saturday");
        }else if(day==7){
            System.out.println("Sunday");
        }
        System.out.println("*******************************");

        int age = 20;

        if(age<2 || age>18){
            System.out.println("Ineligible");
        }else if(age==2){
            System.out.println("Toddler");
        }

    }


}
