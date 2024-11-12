package nareshit.lab.dt12_11_24.Q1;

public class Person {
    String name;
    int age;


    void displayInfo()
    {
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
