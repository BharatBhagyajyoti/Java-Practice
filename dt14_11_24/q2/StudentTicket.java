package nareshit.lab.dt14_11_24.q2;

public class StudentTicket extends Ticket{
    private boolean studentDiscount;

    public StudentTicket(String eventName, int seatNumber, double price, boolean studentDiscount) {
        super(eventName, seatNumber, price);
        this.studentDiscount = studentDiscount;
    }


    public void displayDetails()
    {
        if (getSeatNumber()<=0 || getPrice()<=0)
        {
            System.out.println("Invalid Input for Student ticket !");
        }
        else {
            System.out.println("---Student Ticket---\n");
            super.displayDetails();
            System.out.println("Student Discount :" + studentDiscount);
            System.out.println();
        }

    }



    public boolean isStudentDiscount() {
        return studentDiscount;
    }

    public void setStudentDiscount(boolean studentDiscount) {
        this.studentDiscount = studentDiscount;
    }
}
