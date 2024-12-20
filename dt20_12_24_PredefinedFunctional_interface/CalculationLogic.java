package nareshit.lab.dt20_12_24_PredefinedFunctional_interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class CalculationLogic {

    public static boolean testPredicate(int a, Predicate<Integer> p)
    {
        return p.test(a);
    }

    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isGreaterThanTen = n -> n > 10;
        Predicate<Integer> isPrime = n->{
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num:");
        int number1=sc.nextInt();
        System.out.println(number1 + " is even: " + testPredicate(number1, isEven));
        System.out.println(number1 + " is greater than 10: " + testPredicate(number1, isGreaterThanTen));
        System.out.println(number1 + " is prime: " + testPredicate(number1, isPrime));

        sc.close();
    }

}
