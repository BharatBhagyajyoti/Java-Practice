package nareshit.lab.dt27_12_24.q2;

public class ArrayIndexExceptionDemo {
    public static void main(String[] args) {
        int a[] = new int[2];
        try
        {
            System.out.println(a[3]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exceedinğ the array boundary !");
            System.out.println(e);
        }
    }
}
