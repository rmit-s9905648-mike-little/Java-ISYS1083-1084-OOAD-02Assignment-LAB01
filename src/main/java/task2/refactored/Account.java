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

    //------------------------------------------------------------------
    public double getBalance()
    {
        return balance;

    }// close public double getBalance()

    //------------------------------------------------------------------
    public double getRate()
    {
        return rate;

    }// close public double getRate()

    //------------------------------------------------------------------
    public void updateAddress(String newAddress)
    {
        address = newAddress;

    }// close public void updateAddress(String newAddress)

    //------------------------------------------------------------------
    public void deposit(double amt)
    {
        balance += amt;

    }// close  public void deposit(double amt)


    abstract boolean withdraw(double amt);

}//close public abstract class Account
