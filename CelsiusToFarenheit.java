//package nareshit.lab;

/*
Take input in CommandLine

Celsius To Fahrenheit
Fahrenheit=((9*Celsius)/5)+32;
*/
public class CelsiusToFarenheit {
    public static void main(String[] args) {
        float c=Float.parseFloat(args[0]);
        float f=((9*c)/5)+32;
        System.out.println(c+"C ="+f+"F");
    }
}
