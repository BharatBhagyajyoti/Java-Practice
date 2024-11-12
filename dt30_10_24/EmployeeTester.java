package nareshit.lab.dt30_10_24;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee e1= new Employee("Suraj",21,"SDE",80000,"good");
        double updated=e1.updateSalary();
        System.out.println("Updated salary :"+updated);
    }
}
