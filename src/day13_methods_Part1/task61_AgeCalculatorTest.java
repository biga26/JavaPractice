package day13_methods_Part1;

public class task61_AgeCalculatorTest {

    public static void main(String[] args) {

        ageCalculator(2023,1990);
    }

    public static void ageCalculator(int currentYear, int birthdayYear) {

        int age = currentYear - birthdayYear;
        System.out.println(age);
    }


}
