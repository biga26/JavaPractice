package aaa;

public class JavaReview {


    public static void main(String[] args) {



        JavaReviewMethods methods = new JavaReviewMethods();


        JavaReviewMethods.convertString("123");
        JavaReviewMethods.convertInteger(123);
        //Fibonacci(10);
        System.out.println(JavaReviewMethods.isPrime(4));

        JavaReviewMethods.swapNumbers(1,3);

        JavaReviewMethods.reverseString("home");

        int[] numbers = {1,2,3,4,5};
        JavaReviewMethods.reverseArray(numbers);

        JavaReviewMethods.factorial(5);


        System.out.println(1%10);

        //JavaReviewMethods.sumOfDigits(15);

        JavaReviewMethods.sum(5,6,5);


        System.out.println(
                JavaReviewMethods.calculateAge(1990,2024)
        );






    }

}
