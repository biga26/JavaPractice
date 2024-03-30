package day08_control_flow_statements_2;

public class Task33_GradingTest {
    public static void main(String[] args) {

        int mark=105;

        if(mark<60){
            System.out.println("Fall");
        }else if(mark>=60 && mark<90){
            System.out.println("Pass");
        }else if(mark>=90 && mark<=100){
            System.out.println("Passed with distinction");
        }else{
            System.out.println("Invalid score");
        }

    }
}
