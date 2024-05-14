package task2.refactored;

public abstract class Account
{
    //------------------------------------------------------------------
    //class properties
    String address;
    String bsb;
    String accountNumber;
    double rate;
    double balance;

    abstract double getBalance();
    abstract double getRate();
    abstract void updateAddress(String newAddress);
    abstract void deposit(double amt);
    abstract boolean withdraw(double amt);

}//close public abstract class Account
