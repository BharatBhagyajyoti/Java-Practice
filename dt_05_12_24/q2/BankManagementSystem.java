package nareshit.lab.dt_05_12_24.q2;

public class BankManagementSystem {
    public static void main(String[] args) {
        System.out.println("Savings Account\n=================");
        SavingsAccount s1=new SavingsAccount("5400103342",50000,8);
        s1.generateStatement();


        System.out.println("\n\nChecking Account\n=================");

        CheckingAccount c1=new CheckingAccount("645675345355",879432,5000);
        c1.generateStatement();

    }
}
