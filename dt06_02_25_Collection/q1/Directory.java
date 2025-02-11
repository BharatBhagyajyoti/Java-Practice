package nareshit.lab.dt06_02_25_Collection.q1;

import java.util.ArrayList;

public class Directory {
    ArrayList<Employee> emp=new ArrayList<>();


    public void addEmployee(Employee e)
    {
        emp.add(e);
    }

    public void displayAllEmployees()
    {
        for(Employee e : emp)
        {
            e.toString();
            System.out.println();
        }
    }

    public void updateEmployee(Employee e)
    {
        System.out.println("What do you to update ?\n1. Name\n2. Salary\n3. Position");
    }

    public  void deleteEmployee(Employee e)
    {
        emp.remove(e);
    }

}
