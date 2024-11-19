package nareshit.lab.dt19_11_24.q1;

public class SavingAccount extends BankAccount {
    protected double interestRate;

    public SavingAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void addInterest(int NO)
    {
        double interest = (interestRate / 100) * balance;
        balance += interest;
        System.out.println("Added Interest= " + interest);
        System.out.println("Updated Balance= " + balance);
    }

}
