package nareshit.lab.dt_05_12_24.q2;

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account generateStatement()
    {
        System.out.println("Account no. :"+this.accountNumber);
        System.out.println("Balance :"+this.balance);
        return new Account(this.accountNumber,this.balance);
    }
}
