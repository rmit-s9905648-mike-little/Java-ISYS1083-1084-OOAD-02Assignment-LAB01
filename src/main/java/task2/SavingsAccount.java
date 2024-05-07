package task2;



class SavingsAccount {
    private String name;
    private String address;
    private String bsb;
    private String accountNumber;
    private double rate;
    private double balance;
    private double minAmount; // minimum amount to be maintained



    public SavingsAccount(String name, String address, String bsb, String accountNumber, double rate, double balance, double minAmount) {
        this.name = name;
        this.address = address;
        this.bsb = bsb;
        this.accountNumber = accountNumber;
        this.rate = rate;
        this.balance = balance;
        this.minAmount = minAmount;
    }


    public double getBalance() {
        return balance;
    }

    public double getRate() {
        return rate;
    }

    public void updateAddress(String newAddress) {
        address = newAddress;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public boolean withdraw(double amt) {
        if (balance - minAmount >= amt) {
            balance -= amt;
            return true;
        }
        return false;
    }

}
