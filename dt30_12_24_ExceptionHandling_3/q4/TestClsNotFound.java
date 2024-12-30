package nareshit.lab.dt30_12_24_ExceptionHandling_3.q4;

import java.util.Scanner;

public class TestClsNotFound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Class name to load :");
        String cls= sc.next();
        ClassNotFoundExpDemo c=new ClassNotFoundExpDemo(cls);
        sc.close();
    }
}
