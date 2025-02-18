package nareshit.lab.dt18_02_25_Collection.q2;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class ContactBook {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Map<String, String> contact=new HashMap<>();

        try(sc;) {
            while (true) {

                System.out.println("1. Add Contact\n" +
                        "2. Remove Contact\n" +
                        "3. Exit");
                int ch = sc.nextInt();
                switch (ch) {

                    case 1:
                        sc.nextLine();
                        System.out.println("Name :");
                        String name = sc.nextLine();

                        System.out.println("Phone Number :");
                        String num = sc.next();

                        contact.putIfAbsent(name, num);

                        System.out.println("\u001B[32m Contact Added Successfully 😊 \u001B[0m");
                        System.out.println(contact);
                        break;
                    case 2:
                        sc.nextLine();
                        if (!contact.isEmpty()) {
                            System.out.println("Name :");
                            String Rname = sc.nextLine();

                            if (contact.containsKey(Rname)) {
                                contact.remove(Rname);
                                System.out.println("Contact : " + Rname + " is removed !");
                                System.out.println(contact);
                            }
                        } else {
                            System.out.println("\u001B[31m Contact book is empty ! \u001B[0m");

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

