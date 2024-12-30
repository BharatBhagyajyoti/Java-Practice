package nareshit.lab.dt30_12_24_ExceptionHandling_3.q1;

import java.util.Scanner;

public class TestDivision {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("a= ");
        int a=sc.nextInt();
        System.out.println("b= ");
        int b= sc.nextInt();
        try {
            System.out.println(a+"/"+b+"= "+DivisionExample.performDivision(a,b));
        }
        catch (ArithmeticException e)
        {
            System.out.println("Divisor can't be 0(zero)");
        }
        finally {
            sc.close();
        }
    }
}
