package day17_classObjects_Part2;

public class CapitalOneTest {

    public static void main(String[] args) {

        BankAccountTest acc1 = new BankAccountTest();

        acc1.accountHolder = "Biga";
        acc1.accountNUmber = 123;
        acc1.balance = 1000;

        acc1.deposit(500);
        acc1.withdrawal(50);
        acc1.accInfo();

    }

}
