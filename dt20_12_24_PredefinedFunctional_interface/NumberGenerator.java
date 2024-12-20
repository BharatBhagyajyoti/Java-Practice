package nareshit.lab.dt20_12_24_PredefinedFunctional_interface;
import java.util.Scanner;
import java.util.function.Supplier;

public class NumberGenerator {

    public static int generateRandomNumber(int min, int max) {
        Supplier<Integer> randomSupplier = () -> (int) (Math.random() * (max - min + 1)) + min;
        return randomSupplier.get();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the minimum value: ");
        int min = scanner.nextInt();

        System.out.print("Enter the maximum value: ");
        int max = scanner.nextInt();


        if (min > max) {
            System.out.println("Invalid range. Minimum value cannot be greater than the maximum value.");
        } else {
            int randomNumber = generateRandomNumber(min, max);
            System.out.println("Random number generated: " + randomNumber);
        }

        scanner.close();
    }
}
