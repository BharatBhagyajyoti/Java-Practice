package nareshit.lab.dt20_12_24_PredefinedFunctional_interface;
import java.util.Scanner;
import java.util.function.Consumer;

public class ValueModifier {

    public static void modifyValue(int value, Consumer<Integer> consumer) {
        consumer.accept(value);
    }

    public static void main(String[] args) {


//        Consumer
        Consumer<Integer> doubleValue = n -> System.out.println("After doubling the value: " + (n * 2));
        Consumer<Integer> incrementBy = n -> System.out.println("After incrementing the value by 3: " + (n + 3));
        Consumer<Integer> squareValue = n -> System.out.println("After squaring the value: " + (n * n));


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num:");
        int num= sc.nextInt();

        System.out.println("Original value: " + num);
        modifyValue(num, doubleValue);
        modifyValue(num, incrementBy);
        modifyValue(num, squareValue);

        sc.close();

    }
}
