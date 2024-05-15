package task2.refactored;

public class TestAccounts
    /*
    This is a driver test to test the operation of
    the Current Accounts, and Savings Account.
     */
{
    public static void Main(String[] args)
    {
        CurrentAccount ca = new CurrentAccount("Peter George","41 Average Street","3123","45625632",3.2,100.00,200.00);
        SavingsAccount sa = new SavingsAccount ("Janet Peters","39 Grange Street","3131","73225642",2.8,1500.00,100.00 ) ;

        Double testGetBalance = ca.getBalance();
        System.out.println("Current Balance: "+testGetBalance);
    }// close public static void Main(String[] args)

}// close public class TestAccounts
