package nareshit.lab.dt14_11_24.q3;

public class Tester {
    public static void main(String[] args) {
        // Test Case 1: Invalid Input
        Student student1 = new Student(2003022, "John Doe", 25000.0);

        System.out.println("-------------------");
        // Test Case 2: Valid Inputs
        Student student2 = new Student(2003023, "John Smith", 25000.0);
        System.out.println(student2.displayDetails());
        System.out.println(student2.payFee(25000.0) == 0 ? "All Fees are clear" : "Remaining amount to pay is: " + student2.payFee(25000.0));

        System.out.println("-------------------");
        DayScholar dayScholar = new DayScholar(2003046, "Brian Lara", 25000.0, 5000.0);
        System.out.println(dayScholar.displayDetails());
        double remainingDayScholar = dayScholar.payFee(25000.0);
        System.out.println(remainingDayScholar < 0 ? "All Fees are clear" : "Remaining amount to pay is: " + remainingDayScholar);


        System.out.println("-------------------");
        Hosteller hosteller = new Hosteller(2003076, "Virat Kohli", 25000.0, 8000.0);
        System.out.println(hosteller.displayDetails());
        double remainingHosteller = hosteller.payFee(33000.0);
        System.out.println(remainingHosteller < 0 ? "All Fees are clear" : "Remaining amount to pay is: " + remainingHosteller);
    }
}
