package day14_methods_Part2;

public class task66_DistanceTraveledTest  {

    public static void main(String[] args) {

        double d = distance(40, 50);
        System.out.println(distance(10,5));
        System.out.println(d);

        if(d>500){
            System.out.println("u spent too much gas");
        }else{
            System.out.println("you spent ok gas");
        }

    }

    public static double distance(double speed, int time) {
        double distanceTraveled = speed * time;
        return distanceTraveled;
    }

}
