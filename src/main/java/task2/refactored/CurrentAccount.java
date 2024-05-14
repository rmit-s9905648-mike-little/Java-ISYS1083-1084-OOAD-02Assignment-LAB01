package task2.refactored;


class CurrentAccount extends Account
{
    //------------------------------------------------------------------
    // class properties
    private static String name;
    private double overdraft; // overdraft facility granted
    private double overdrawn = 0; // overdrawn amount

    //------------------------------------------------------------------
    public CurrentAccount(
                                String name,
                                String address,
                                String bsb,
                                String accountNumber,
                                double rate,
                                double balance,
                                double overdraft
                            )
    {
        this.name = name;
        this.address = address;
        this.bsb = bsb;
        this.accountNumber = accountNumber;
        this.rate = rate;
        this.balance = balance;
        this.overdraft = overdraft;

    }// close public CurrentAccount ()

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

    //------------------------------------------------------------------
    public boolean withdraw(double amt)
    {
        if (balance + overdraft >= amt)
        {
            if (amt < balance) balance -= amt;
            else {
                balance = 0;
                overdrawn += amt - balance;
            }
            return true;
        }
        return false;

    }// close public boolean withdraw(double amt)
    //------------------------------------------------------------------

}// close class CurrentAccount
