package nareshit.lab.dt13_11_24.q2;

public class Student {
    protected String name;
    protected int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void displayDetails()
    {
        System.out.println("Name :"+name);
        System.out.println("Roll :"+roll);
    }


    /*
    public double calculatePercentage()
    {
        double pct;

        return pct;
    }
    */

}
