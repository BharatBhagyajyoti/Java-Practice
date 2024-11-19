package nareshit.lab.dt19_11_24.q1;

public class CheckingAccount extends BankAccount {
    protected double overdraftLimit=3000;

    public CheckingAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }


    void withdraw(double amount)
    {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdraw amount= " + amount);
            System.out.println("Updated Balance= " + balance);
        } else {
            System.out.println("Exceeds overdraft limit.");
        }

    }
}
