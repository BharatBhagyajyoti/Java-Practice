package nareshit.lab.dt26_12_24_Exception.q4;

import java.util.Scanner;

public class ExceptionHandlingDemo {

    public static void handleExceptions(String input) {
        try {
            // Print the length of the input string
            System.out.println("Length of the input string: " + input.length());

            // Attempt to convert the string input to an integer
            int number = Integer.parseInt(input);
            System.out.println("Converted number: " + number);

            // Intentionally assign null and cause a NullPointerException
            String nullCheck = input.equals("null") ? null : input;
            System.out.println("Trying to invoke a method on the input: " + nullCheck.toUpperCase());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid input, not a number.");
            e.printStackTrace(); // Print the stack trace for debugging
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Attempted to operate on a null object.");
            e.printStackTrace(); // Print the stack trace for debugging
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to convert to an integer: ");
        String userInput = scanner.nextLine();


        handleExceptions(userInput);
//        handleExceptions(null);

        scanner.close();
    }
}
