package nareshit.lab.dt28_11_24.q2;

public class Zomato {
    public static void main(String[] args) {
        Order o1=new Order(234312,"MSI gf63",75999);
        Customer c1=new Customer("Bharat",1430,"Kendujhar",o1);
        System.out.println(c1);

    }

}
