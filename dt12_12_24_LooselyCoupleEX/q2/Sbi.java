package nareshit.lab.dt12_12_24_LooselyCoupleEX.q2;
public class Sbi implements Bank {
    private double accountBalance;

    public Sbi(double initialBalance) {
        this.accountBalance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        accountBalance += amount;
        System.out.println("SBI: Deposited ₹" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("SBI: Withdrawn ₹" + amount);
        } else {
            System.out.println("SBI: Insufficient balance for withdrawal!");
        }
    }

    @Override
    public double checkBalance() {
        return accountBalance;
    }
}
