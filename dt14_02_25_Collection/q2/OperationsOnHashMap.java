package nareshit.lab.dt14_02_25_Collection.q2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OperationsOnHashMap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Map<String,Integer> fruits=new HashMap<>();
        fruits.put("Apple",50);
        fruits.put("Banana",30);
        fruits.put("Orange",20);

        Map<String,Integer>fruits1=new HashMap<>();
        fruits1.put("Kiwi",25);
        fruits1.put("Jackfruit",70);


        System.out.println("Before merging");
        System.out.println("Fruits :"+fruits);
        System.out.println("Fruits1 :"+fruits1);


        fruits.putAll(fruits1);
        System.out.println("\nAfter Merging");
        System.out.println(fruits);

        System.out.println("\nputIfAbsent :");
        System.out.println("Key :");
        String key= sc.next();
        System.out.println("Value :");
        Integer val= sc.nextInt();

        fruits.putIfAbsent(key,val);

        System.out.println(fruits);



        System.out.println("\nWant to update( replace() ) :");
        key= sc.next();
        System.out.println("Enter qty.֫:");
        val= sc.nextInt();

        fruits.replace(key,val);
        System.out.println(fruits);


        System.out.println("\nWant to delete :");
        key= sc.next();
        fruits.remove(key);
        System.out.println(fruits);

    }
}
