package nareshit.lab.dt18_02_25_Collection.q1;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class StudentGradeBook {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Map<String, Character> student=new HashMap<>();

        try(sc;) {
            while (true) {

                System.out.println("1. Add Student Grade\n" +
                        "2. Remove Student Grade\n" +
                        "3. Exit");
                int ch = sc.nextInt();
                switch (ch) {

                    case 1:
                        sc.nextLine();
                        System.out.println("Student Name :");
                        String name = sc.nextLine();

                        System.out.println("Grade :");
                        char grade = sc.next().charAt(0);

                        student.putIfAbsent(name, grade);

                        System.out.println("\u001B[32m Student Added Successfully 😊 \u001B[0m");
                        System.out.println(student);
                        break;
                    case 2:
                        sc.nextLine();
                        if (!student.isEmpty()) {
                            System.out.println("Student name :");
                            String Rname = sc.nextLine();

                            if (student.containsKey(Rname)) {
                                student.remove(Rname);
                                System.out.println("Student " + Rname + " is removed !");
                                System.out.println(student);
                            }
                        } else {
                            System.out.println("\u001B[31m Grade book is empty ! \u001B[0m");

                        }
                        break;
                    case 3:

                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid input !");
                        break;
                }
//            break;
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("Only intger input allowed !");
        }
    }

}
