package nareshit.lab.dt_05_12_24.q2;

public class CheckingAccount extends Account{
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public  Account generateStatement()
    {
        super.generateStatement();
        System.out.println("Over draft limit:"+this.overdraftLimit);
        return new CheckingAccount(this.getAccountNumber(),this.getBalance(),this.overdraftLimit);
    }
}
