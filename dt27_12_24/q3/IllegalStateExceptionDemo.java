package nareshit.lab.dt27_12_24.q3;

public class IllegalStateExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Calling throwIllegalException() method");
        throwIllegalException();
    }

    static void throwIllegalException( )
    {
        try{ throw new IllegalStateException("MyException"); }
        catch(IllegalStateException objA)
        { System.out.println("caught:" +objA); }
    }
}
