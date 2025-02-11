package nareshit.lab.dt11_01_25_Collection.q2;

import java.util.Comparator;

public class Customer {
    Integer customerNumber;
     String customerName;
     Double customerBill;

    public Customer(int customerNumber, String customerName, double customerBill) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.customerBill = customerBill;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", customerName='" + customerName + '\'' +
                ", customerBill=" + customerBill +
                '}';
    }



/*
    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public double getCustomerBill() {
        return customerBill;
    }

    public void setCustomerBill(double customerBill) {
        this.customerBill = customerBill;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

 */
}
