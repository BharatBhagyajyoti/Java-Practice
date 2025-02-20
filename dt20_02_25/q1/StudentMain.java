package nareshit.lab.dt20_02_25.q1;




import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) throws IOException {

        Scanner sc=new Scanner(System.in);
        FileOutputStream fos=new FileOutputStream("D:\\student.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        try(sc;fos;oos){
            System.out.println("Enter how many object you want to enter");
            Integer x=sc.nextInt();
            for(int i=0;i<x;i++) {

                oos.writeObject(Student.getStudentObject());
            }
            System.out.println("Data inserted Successfully...");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}