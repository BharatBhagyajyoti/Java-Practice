package nareshit.lab.dt20_12_24_PredefinedFunctional_interface;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionApplier {
    public static int applyFunction(int value, Function<Integer, Integer> f)
    {
        return f.apply(value);
    }

    public static void main(String[] args) {
        Function<Integer,Integer>add=num-> num+5;
        Function<Integer,Integer>multiply=num-> num*2;
        Function<Integer,Integer>subtract=num-> num-3;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Num:");
        int n= sc.nextInt();

        System.out.println("Original value :"+n);
        System.out.println("After adding 5 :"+applyFunction(n,add));
        System.out.println("After multiplying by 2 :"+applyFunction(n,multiply));
        System.out.println("After subtracting 3 :"+applyFunction(n,subtract));


        sc.close();

    }
}
