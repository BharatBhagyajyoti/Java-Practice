package nareshit.lab.dt12_10_24.Q1;

public class Employee extends Person{
    String employeeId;


    void displayEmployeeInfo() {
        super.displayInfo();
        System.out.println("Employee ID :"+employeeId);
    }

    public Employee(String name, int age,String employeeId) {
        super(name,age);
        this.employeeId = employeeId;
    }
}
