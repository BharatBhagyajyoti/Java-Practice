package nareshit.lab.dt12_12_24_LooselyCoupleEX.q2;
public class Icici implements Bank {
    private double accountBalance;

    public Icici(double initialBalance) {
        this.accountBalance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        accountBalance += amount;
        System.out.println("ICICI: Deposited ₹" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("ICICI: Withdrawn ₹" + amount);
        } else {
            System.out.println("ICICI: Insufficient balance for withdrawal!");
        }
    }

    @Override
    public double checkBalance() {
        return accountBalance;
    }
}
