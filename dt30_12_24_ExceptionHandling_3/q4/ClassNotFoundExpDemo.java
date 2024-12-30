package nareshit.lab.dt30_12_24_ExceptionHandling_3.q4;

public class ClassNotFoundExpDemo {
    public ClassNotFoundExpDemo(String cls) {

        try{

            Class.forName(cls);
            System.out.println("Class "+cls+" found: "+cls);
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Class isn't exist !");
            e.printStackTrace();
        }
    }
}
