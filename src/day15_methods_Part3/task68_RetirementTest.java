package day15_methods_Part3;

public class task68_RetirementTest {

    public static void main(String[] args) {

        yearsUntilRetirement("Biga", 1990);


    }

    public static void yearsUntilRetirement(String name, int year) {

        //retirement age is 65

        int retirementAge = 65 - calculateAge(year);
        System.out.println(name + " retires in " +retirementAge + " years");
    }

    public static int calculateAge(int yearBirth){

        return 2019-yearBirth;
    }




}
