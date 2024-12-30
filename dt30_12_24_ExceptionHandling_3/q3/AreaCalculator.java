package nareshit.lab.dt30_12_24_ExceptionHandling_3.q3;

public class AreaCalculator {
    public static double calculateArea(double l,double b)
    {
        if (l<0 || b<0)
            throw new IllegalArgumentException("Value Can't be negative");
        return l*b;
    }
}
