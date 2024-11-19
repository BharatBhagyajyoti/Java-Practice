package nareshit.lab.dt19_11_24.q2;

import java.util.Scanner;

public class OnlineShopping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("-----Electronics-----");
        Electronics e1=new Electronics("Realme","Realme 12 pro+",21999);
        e1.displayInfo();
        System.out.println("Enter Quantity :");
        int qty= sc.nextInt();
        double cost=e1.calculateTotalCost(qty);
        System.out.println("Total Cost :"+cost);


        System.out.println("\n-----Clothing-----");
        Clothing c1=new Clothing("HRX",1299,"M");
        c1.displayInfo();
        System.out.println("Enter Quantity :");
        int qty1= sc.nextInt();
        c1.calculateTotalCost(qty1);
        double cost1=e1.calculateTotalCost(qty);
        System.out.println("Total Cost :"+cost1);
    }
}
