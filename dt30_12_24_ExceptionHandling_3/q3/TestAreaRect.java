package nareshit.lab.dt30_12_24_ExceptionHandling_3.q3;

import java.util.Scanner;

public class TestAreaRect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Length :");
        int l= sc.nextInt();
        System.out.println("Breadth :");
        int b= sc.nextInt();

        try {
            System.out.println("Area :"+AreaCalculator.calculateArea(l,b));
        }
        catch (IllegalArgumentException i)
        {
            System.out.println("Value can't be negative");
        }

    }
}
