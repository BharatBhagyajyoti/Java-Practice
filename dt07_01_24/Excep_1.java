package nareshit.lab.dt07_01_24;

public class Excep_1 {
    public static void main(String args[])
    {
        new Thread()
        {
            public void run()
            {
                System.out.println("task one");
            }
        }.start();

        new Thread()
        {
            public void run()
            {
                System.out.println("task two");
            }
        }.start();

    }
}
