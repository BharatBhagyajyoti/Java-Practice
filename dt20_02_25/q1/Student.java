package nareshit.lab.dt20_02_25.q1;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

public class Student implements Serializable{
    private Integer studentId;
    private String studentName;
    private Double studentFees;
    private Date dateOfAdmission ;
    public Student(Integer studentId, String studentName, Double studentFees, Date dateOfAdmission) {
        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentFees = studentFees;
        this.dateOfAdmission = dateOfAdmission;
    }

    public static Student getStudentObject() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student id:");
        Integer id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student Name:");
        String name=sc.nextLine();
        System.out.println("Enter Student fees:");
        Double fees=sc.nextDouble();
        return new Student(id, name, fees, new Date());
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
                + ", dateOfAdmission=" + dateOfAdmission+"]";
    }

}