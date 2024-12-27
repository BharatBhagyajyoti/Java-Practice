package nareshit.lab.dt26_12_24_Exception.q3;

public class IllegalStateExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Calling throwIllegalException from main method:");
        throwIllegalException();
    }


    static void throwIllegalException( ) {
        try{
            throw new IllegalStateException("MyException");
        } catch(IllegalStateException objA){
            System.out.println("caught:" +objA);
        }
    }
}
