package day14_methods_Part2;

public class Lab5_CaughtSpeedingTest {
    public static void main(String[] args) {

    }

    public static void caughtSpeeding(int speed, boolean isBirthday){

        if(isBirthday){
            if(speed<=65){
                System.out.println(0);
            }else if(speed>=66 && speed <=85){
                System.out.println(1);
            }else if(speed>=86){
                System.out.println(2);
            }
        }else{
            if(speed<=60){
                System.out.println(0);
            }else if(speed>=61 && speed<=80){
                System.out.println(1);
            }else if(speed>=81){
                System.out.println(2);
            }
        }

    }
}
