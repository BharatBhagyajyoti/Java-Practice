package nareshit.lab.dt26_12_24_Exception.q1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the first integer (a): ");
            int a = sc.nextInt();

            System.out.print("Enter the second integer (b): ");
            int b = sc.nextInt();

            System.out.println("\nYou entered a = " + a + " and b = " + b);
        }
        catch (InputMismatchException e) {
            System.out.println("\nAn InputMismatchException occurred.");

            System.out.println("getMessage(): " + e.getMessage());

            System.out.println("\ntoString(): " + e.toString());

            System.out.println("\nStack trace:");
            e.printStackTrace();
        }
        finally {
            sc.close();
        }
    }
}
