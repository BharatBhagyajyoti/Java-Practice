package nareshit.lab.dt_05_12_24.q2;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public  Account generateStatement()
    {
        super.generateStatement();
        System.out.println("Interest:"+this.interestRate+"%");
        return new Account(this.getAccountNumber(),this.getBalance());
    }

}
