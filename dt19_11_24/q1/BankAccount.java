package nareshit.lab.dt19_11_24.q1;

public class BankAccount {
    protected int accountNumber;
    protected double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    void deposite(double amount)
    {
        balance+=amount;
        System.out.println("Deposit amount= "+amount);
        System.out.println("Balance= "+balance);
    }

    void withdraw(double amount)
    {
        if (balance>amount) {
            balance -= amount;
            System.out.println("Withdraw amount= "+amount);
            System.out.println("Balance= "+balance);

        }
        else {
            System.out.println("Insufficient funds.");
        }
    }

}
