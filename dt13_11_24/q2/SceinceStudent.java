package nareshit.lab.dt13_11_24.q2;

public class SceinceStudent extends Student{
    private int physicsMarks;
    private int chemistryMarks;
    private int mathMark;

    public SceinceStudent(String name, int roll, int physicsMarks, int chemistryMarks, int mathMark) {
        super(name, roll);
        this.physicsMarks = physicsMarks;
        this.chemistryMarks = chemistryMarks;
        this.mathMark = mathMark;
    }

    public void displayDetails()
    {

        if (physicsMarks<=0 || chemistryMarks<=0||mathMark<=0||roll<=0)
        {
            System.out.println("Invalid input !");
        }
        else {
            System.out.println("---SCIENCE---\n");
            super.displayDetails();
            System.out.println("Physics :"+physicsMarks);
            System.out.println("Chemistry :"+chemistryMarks);
            System.out.println("Mathematics :"+mathMark);
        }
    }


    public double calculatePercentage()
    {
        double pct;
        int full=300;
        int tot=physicsMarks+chemistryMarks+mathMark;
        pct=((double) tot /full)*100;

        return pct;
    }
}
