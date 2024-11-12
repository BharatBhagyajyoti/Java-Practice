//package nareshit.lab;

/*
Take input in CommandLine

Fahrenheit To Celsius
Celsius=(Fahrenheit-32)*5/9;

 */

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        float f=Float.parseFloat(args[0]);
        float c=(f-32)*(5f/9f);
        System.out.println(f+"F ="+c+"C");

    }
}
