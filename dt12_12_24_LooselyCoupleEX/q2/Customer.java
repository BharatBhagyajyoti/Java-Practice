package nareshit.lab.dt12_12_24_LooselyCoupleEX.q2;
public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void deposit(Bank bank, double amount) {
        System.out.println(name + " is depositing ₹" + amount);
        bank.deposit(amount);
    }

    public void withdraw(Bank bank, double amount) {
        System.out.println(name + " is withdrawing ₹" + amount);
        bank.withdraw(amount);
    }

    public void checkBalance(Bank bank) {
        System.out.println(name + "'s account balance: ₹" + bank.checkBalance());
    }
}
