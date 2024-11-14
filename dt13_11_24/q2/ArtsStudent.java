package nareshit.lab.dt13_11_24.q2;

public class ArtsStudent extends Student{
    private int historyMarks;
    private int geographyMarks;
    private int englishMarks;

    public ArtsStudent(String name, int roll, int historyMarks, int geographyMarks, int englishMarks) {
        super(name, roll);
        this.historyMarks = historyMarks;
        this.geographyMarks = geographyMarks;
        this.englishMarks = englishMarks;
    }

    public void displayDetails()
    {
        if (historyMarks<=0 || geographyMarks<=0||englishMarks<=0||roll<=0)
        {
            System.out.println("Invalid input !");
        }
        else {
            System.out.println("---ARTS---\n");
            super.displayDetails();
            System.out.println("History :" + historyMarks);
            System.out.println("Geography :" + geographyMarks);
            System.out.println("English :" + englishMarks);
        }
    }


    public double calculatePercentage()
    {
        double pct;
        int full=300;
        int tot=historyMarks+geographyMarks+englishMarks;
        pct= ((double)tot/full)*100;


        return pct;
    }

}
