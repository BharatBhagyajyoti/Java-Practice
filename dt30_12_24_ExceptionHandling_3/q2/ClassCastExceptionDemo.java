package nareshit.lab.dt30_12_24_ExceptionHandling_3.q2;

public class ClassCastExceptionDemo {
    public static void handleClassCastException()
    {
        Object [] arr={"Hello", 'A', "Java"};
        try {
            for (int i=0;i<arr.length;i++)
            {
                arr[i]=(String)arr[i];
                System.out.println("String cast successfull :"+arr[i]);
            }

        }
        catch (ClassCastException c)
        {
            System.out.println("Can't cast to STRING");
            c.printStackTrace();
        }
    }
}
