package day04_arithmetic_operators;

public class DiscountTest {
    public static void main(String[] args) {

        //This program calculates the sale price of an
        //item that is regular priced at $59, with a 20% Discount on it

        int regularPrice=59;
        double discount;
        double salesPrice;

        discount = 0.2;
        salesPrice = regularPrice * (1-discount);

        System.out.println("discount is " + discount);
        System.out.println("salesPrice is " + salesPrice);

    }
}
