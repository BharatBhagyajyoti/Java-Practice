package nareshit.lab.dt14_11_24.q3;

public class DayScholar extends Student {
    double transportFee;

    public DayScholar(int studentId, String name, double examFee, double transportFee) {
        super(studentId, name, examFee);
        if (transportFee <= 0) {
            System.out.println("Error Invalid Input");
            return;
        }
        this.transportFee = transportFee;
    }

    @Override
    public String displayDetails() {
        return "DayScholar[transportFee=" + transportFee + ", name=" + name + ", studentId=" + studentId + ", examFee=" + examFee + "]";
    }

    @Override
    public double payFee(double amount) {
        double totalFee = examFee + transportFee;
        double remaining = totalFee - amount;
        return remaining < 0 ? remaining : Math.abs(remaining);
    }

    @Override
    public String toString() {
        return displayDetails();
    }
}
