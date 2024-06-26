package day04_arithmetic_operators;

public class ContributionTest {
    public static void main(String[] args) {

        /*
		This program calculates the amount of pay that will be contributed to a
		retirement plan if 5%, 8% or 10% of monthly pay is withheld
		*/

        //Variables to hold the monthly pay and the amount of the Contribution

        double monthlyPay = 6000;
        double contribution;

        //5 percent
        contribution = monthlyPay * 0.05;
        System.out.println("5% contribution is " + contribution);

        //8 percent
        contribution = monthlyPay * 0.08;
        System.out.println("8% contribution is " + contribution);

        //10 percent
        contribution = monthlyPay * 0.10;
        System.out.println("10% contribution is " + contribution);

    }
}
