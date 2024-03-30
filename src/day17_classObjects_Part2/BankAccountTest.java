package day17_classObjects_Part2;

public class BankAccountTest {

    double balance;
    String accountHolder;
    int accountNUmber;

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println(balance);
    }
    public void withdrawal(double amount){
        balance = balance - amount;
        System.out.println(balance);
    }
    public void accInfo(){
        String info = accountHolder + " has on account: " + balance;
        System.out.println(info);
    }

}
