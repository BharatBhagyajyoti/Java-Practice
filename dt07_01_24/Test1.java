package nareshit.lab.dt07_01_24;
class Test extends Thread
{
    public void run()
    {
        for(int i=0; i<=10; i++)
        {
            System.out.println("Hello Welcome here.."+i);
        }
    }
}
public class Test1
{
    public static void main(String[] args)
    {
        Test t = new Test();
        t.start();
        t.start();
    }
}
