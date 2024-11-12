//package nareshit.lab;
/*
write a Java program to calculate compound interest for 3 years?
Amount Formula : A=P(1+r/100)^{t})
Compound Interest = A - P

Enter Principal value in command line
 */

public class CompoundInterest {
    public static void main(String[] args) {
        double p=Double.parseDouble(args[0]);
        double rate_interest= 5;
        double amount=p*((1+rate_interest/100)*(1+rate_interest/100)*(1+rate_interest/100));
        double cInterest=amount-p;
        System.out.println("Compound Interest = "+ cInterest);
    }
}
