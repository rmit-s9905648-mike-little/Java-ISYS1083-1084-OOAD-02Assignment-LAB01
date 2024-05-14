package task2.refactored;

class SavingsAccount extends Account
{
    //------------------------------------------------------------------
    //
    private String name;
    private String address;
    private String bsb;
    private String accountNumber;
    private double rate;
    private double balance;
    private double minAmount; // minimum amount to be maintained



    //------------------------------------------------------------------
    public SavingsAccount(
                                String name,
                                String address,
                                String bsb,
                                String accountNumber,
                                double rate,
                                double balance,
                                double minAmount
                            )
    {
        this.name = name;
        this.address = address;
        this.bsb = bsb;
        this.accountNumber = accountNumber;
        this.rate = rate;
        this.balance = balance;
        this.minAmount = minAmount;

    }// close public SavingsAccount()

    //------------------------------------------------------------------
    public double getBalance()
    {
        return balance;

    }// close public double getBalance()

    //------------------------------------------------------------------
    public double getRate()
    {
        return rate;

    }// close  public double getRate()

    //------------------------------------------------------------------
    public void updateAddress(String newAddress)
    {
        address = newAddress;

    }// close public void updateAddress(String newAddress)

    //------------------------------------------------------------------
    public void deposit(double amt)
    {
        balance += amt;

    }// close public void deposit(double amt)

    //------------------------------------------------------------------
    public boolean withdraw(double amt)
    {
        if (balance - minAmount >= amt)
        {
            balance -= amt;
            return true;
        }
        return false;

    }// close public boolean withdraw(double amt)
    //------------------------------------------------------------------

}// close class SavingsAccount
