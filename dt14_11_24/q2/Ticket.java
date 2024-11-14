package nareshit.lab.dt14_11_24.q2;

public class Ticket {

    private String eventName;
    private int seatNumber;
    private double price;


    public Ticket(String eventName, int seatNumber, double price)
    {
        this.eventName=eventName;
        this.seatNumber=seatNumber;
        this.price=price;
    }

    public void displayDetails()
    {
//        System.out.println("---Regulr Ticket---\n");

        if (seatNumber<=0 || price<=0)
        {
            System.out.println("Invalid Input for Regular ticket!");
        }
        else {
            System.out.println("Event :" + eventName);
            System.out.println("Seat number:" + seatNumber);
            System.out.println("Price :" + price);
        }
    }



    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
