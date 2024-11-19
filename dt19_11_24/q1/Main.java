package nareshit.lab.dt19_11_24.q1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing SavingAccount:");
        SavingAccount savingAccount = new SavingAccount(5400101, 10000, 5); // 5% interest
        savingAccount.deposite(55000);
        savingAccount.addInterest(5); // Adding 5% interest

        System.out.println("\nTesting CheckingAccount:");
        CheckingAccount checkingAccount = new CheckingAccount(5400202, 5000, 3000); // 3000 overdraft limit
        checkingAccount.withdraw(7000); // Valid withdrawal (within overdraft)
        checkingAccount.withdraw(9000); // Exceeds overdraft limit
    }
}
