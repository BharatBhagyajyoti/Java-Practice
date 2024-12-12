package nareshit.lab.dt12_12_24_LooselyCoupleEX.q2;
public class TestBankingSystem {
    public static void main(String[] args) {
        // Creating Bank Instances
        Bank sbi = new Sbi(5000);
        Bank hdfc = new Hdfc(10000);
        Bank icici = new Icici(7000);

        // Creating Customer
        Customer customer = new Customer("John");

        // SBI Transactions
        System.out.println("\n--- Interacting with SBI ---");
        customer.deposit(sbi, 2000);
        customer.withdraw(sbi, 1000);
        customer.checkBalance(sbi);

        // HDFC Transactions
        System.out.println("\n--- Interacting with HDFC ---");
        customer.deposit(hdfc, 3000);
        customer.withdraw(hdfc, 15000); // Exceeding balance
        customer.checkBalance(hdfc);

        // ICICI Transactions
        System.out.println("\n--- Interacting with ICICI ---");
        customer.deposit(icici, 500);
        customer.withdraw(icici, 3000);
        customer.checkBalance(icici);
    }
}
