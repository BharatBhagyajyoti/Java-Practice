package nareshit.lab.dt12_12_24_LooselyCoupleEX.q2;
public class Hdfc implements Bank {
    private double accountBalance;

    public Hdfc(double initialBalance) {
        this.accountBalance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        accountBalance += amount;
        System.out.println("HDFC: Deposited ₹" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("HDFC: Withdrawn ₹" + amount);
        } else {
            System.out.println("HDFC: Insufficient balance for withdrawal!");
        }
    }

    @Override
    public double checkBalance() {
        return accountBalance;
    }
}
