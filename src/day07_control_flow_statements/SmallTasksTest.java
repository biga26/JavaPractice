package day07_control_flow_statements;

public class SmallTasksTest {

    public static void main(String[] args) {

        int x, y;
        x = 0;
        y = 10;

        if (y==20){
            x = 5;
        }
        System.out.println(x);

        //2-Write an if statement that multiplies payrate by 1.5 if hours is greater than 40
        double payRate = 1000;
        int hours = 50;

        if(hours>40){
            payRate = payRate * 1.5;
        }
        System.out.println(payRate);

        //3-Write an if statement that sets the variable fees to 50 if the boolean variable max is true
        boolean max = false;
        int fee = 20;

        if(max){
            fee = 50;
        }
        System.out.println("Fee is: " + fee);

        //5-Write an if statement that prints "Ideal Temp" if the temp is between 70 and 80
        int temp = 75;

        if(temp>=70 && temp<=80){
            System.out.println("Ideal temp");
        }






    }




}
