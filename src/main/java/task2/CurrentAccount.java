package task2;


class CurrentAccount {
    private static String name;
    private String address;
    private String bsb;
    private String accountNumber;
    private double rate;
    private double balance;
    private double overdraft; // overdraft facility granted
    private double overdrawn = 0; // overdrawn amount


    public CurrentAccount(String name, String address, String bsb, String accountNumber, double rate, double balance, double overdraft) {
        this.name = name;
        this.address = address;
        this.bsb = bsb;
        this.accountNumber = accountNumber;
        this.rate = rate;
        this.balance = balance;
        this.overdraft = overdraft;
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
        if (balance + overdraft >= amt) {
            if (amt < balance) balance -= amt;
            else {
                balance = 0;
                overdrawn += amt - balance;
            }
            return true;
        }
        return false;
    }
}
