package nareshit.lab.dt14_11_24.q3;

public class Student {
    int studentId;
    String name;
    double examFee;

    public Student(int studentId, String name, double examFee) {
        if (studentId <= 0 || examFee <= 0) {
            System.out.println("Error Invalid Input");
            return;
        }
        this.studentId = studentId;
        this.name = name;
        this.examFee = examFee;
    }

    public String displayDetails() {
        return "Student[name=" + name + ", studentId=" + studentId + ", examFee=" + examFee + "]";
    }

    public double payFee(double amount) {
        double remaining = examFee - amount;
        return remaining < 0 ? remaining : Math.abs(remaining);
    }

    @Override
    public String toString() {
        return displayDetails();
    }
}
