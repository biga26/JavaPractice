package day33_ClassObjects_Constructors;

public class BankAccountNew {

    double balance;

    public BankAccountNew(){
        balance = 0.0;
    }
    public BankAccountNew(double startBalance){
        balance = startBalance;
    }
    public void deposit(String str){
        this.balance = Double.parseDouble(str);
    }
    public double getBalance(){
        return balance;
    }

}
