package nareshit.lab.dt14_11_24.q3;

public class Hosteller extends Student {
    double hostelFee;

    public Hosteller(int studentId, String name, double examFee, double hostelFee) {
        super(studentId, name, examFee);
        if (hostelFee <= 0) {
            System.out.println("Error Invalid Input");
            return;
        }
        this.hostelFee = hostelFee;
    }

    @Override
    public String displayDetails() {
        return "Hosteller[hostelFee=" + hostelFee + ", name=" + name + ", studentId=" + studentId + ", examFee=" + examFee + "]";
    }

    @Override
    public double payFee(double amount) {
        double totalFee = examFee + hostelFee;
        double remaining = totalFee - amount;
        return remaining < 0 ? remaining : Math.abs(remaining);
    }

    @Override
    public String toString() {
        return displayDetails();
    }
}
