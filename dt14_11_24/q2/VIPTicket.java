package nareshit.lab.dt14_11_24.q2;

public class VIPTicket extends Ticket{
    private String specialAccess;

    public VIPTicket(String eventName, int seatNumber, double price, String specialAccess) {
        super(eventName, seatNumber, price);
        this.specialAccess = specialAccess;
    }

    public void displayDetails()
    {

        if (getSeatNumber()<=0 || getPrice()<=0)
        {
            System.out.println("Invalid Input for VIP ticket !");
        }
        else {
            System.out.println("---VIP Ticket---\n");
            super.displayDetails();
            System.out.println("Special Access :" + specialAccess);
            System.out.println();
        }

    }



    public String getSpecialAccess() {
        return specialAccess;
    }

    public void setSpecialAccess(String specialAccess) {
        this.specialAccess = specialAccess;
    }
}
