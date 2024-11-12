package nareshit.lab.dt12_11_24.Q1;

public class Manager extends Employee{

    String department;


    void displayManagerInfo()
    {
        super.displayEmployeeInfo();
        System.out.println("Department :"+department);
    }

    public Manager(String name, int age, String empid,String department) {
        super(name,age,empid);
        this.department = department;
    }
}
