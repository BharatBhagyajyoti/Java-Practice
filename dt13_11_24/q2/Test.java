package nareshit.lab.dt13_11_24.q2;

public class Test {
    public static void main(String[] args) {
        SceinceStudent sc1=new SceinceStudent("Bharat",2003022,80,80,80);
        ArtsStudent art1=new ArtsStudent("Raja",2005034,76,76,76);

        sc1.displayDetails();
        System.out.println("Percentage="+sc1.calculatePercentage());

        System.out.println("--------------------\n");
        art1.displayDetails();

        System.out.println("Percentage ="+art1.calculatePercentage());
    }
}
