package nareshit.lab.dt28_11_24.q2;

public class Customer {
    private int customerId;
    private String customerName;
    private String customerAddress;
    private Order order; //HAS-A relation

    public Customer(String customerName, int customerId, String customerAddress, Order order) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.customerAddress = customerAddress;
        this.order = order;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", order :" + order +
                '}';
    }
}
