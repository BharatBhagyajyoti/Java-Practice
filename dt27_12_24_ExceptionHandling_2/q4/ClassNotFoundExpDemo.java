package nareshit.lab.dt27_12_24.q4;

public class ClassNotFoundExpDemo {
    public ClassNotFoundExpDemo()
    {
        Class c;
        try {
            c = Class.forName("TestClass");
        }
        catch (Exception e)
        {
            System.err.println(e);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ClassNotFoundExpDemo cs=new ClassNotFoundExpDemo();

    }

}
