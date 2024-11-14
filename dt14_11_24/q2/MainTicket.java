package nareshit.lab.dt14_11_24.q2;

public class MainTicket {
    public static void main(String[] args) {
        Ticket t1=new Ticket("Concert",100,50);
        VIPTicket vt1=new VIPTicket("VIP Concert",202,80,"Backstage Access");
        StudentTicket s1=new StudentTicket("Student Event", 301, 30.0, true);


        t1.displayDetails();
        vt1.displayDetails();
        s1.displayDetails();
    }
}
