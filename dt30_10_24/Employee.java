package nareshit.lab.dt30_10_24;

public class Employee {

    private String name;
    private int age;
    private String department;
    private double salary;
    private String performance;

    public Employee(String name, int age, String department, double salary, String performance)
    {
        this.name=name;
        this.age=age;
        this.department=department;
        this.salary=salary;
        this.performance=performance;
    }

    public double updateSalary()
    {
        double newSal=0;
        if (this.performance.equals("good"))
        {
            newSal= this.salary+10000;
        }
        if (this.performance.equals("average"))
        {
            newSal= this.salary+5000;
        }
        if (this.performance.equals(null))
        {
            newSal= this.salary;
        }
        return newSal;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }


}
