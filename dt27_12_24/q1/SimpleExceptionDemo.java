package nareshit.lab.dt27_12_24.q1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try {
            System.out.println("a =");
            int a = sc.nextInt();
            System.out.println("b =");
            int b = sc.nextInt();
        }catch (InputMismatchException e)
        {
            System.out.println("getMessage :"+e.getMessage());
            System.out.println("println() :"+e);
            System.out.println("toString() :"+e.toString());
            System.out.println("printStackTrace :");
            e.printStackTrace();
        }

    }
}
