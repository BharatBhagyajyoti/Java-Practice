package nareshit.lab.dt26_12_24_Exception.q2;

public class ArrayIndexExceptionDemo {
    public static void main(String[] args) {
        int []a = new int[2];
        try{
            System.out.println(a[3]);
        }catch (ArrayIndexOutOfBoundsException e)
        {
//            System.out.println("Message: Index 3 out of bounds for length 2");
            System.out.println("Message: "+e.getMessage());
            System.out.println("String representation: "+e.toString());
            System.out.println("stack Trace :");
            e.printStackTrace();

        }
    }
}
