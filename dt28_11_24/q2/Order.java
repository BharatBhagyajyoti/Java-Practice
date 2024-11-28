package nareshit.lab.dt28_11_24.q2;

public class Order {
    private int orderId;
    private String itemName;
    private double itemPrice;

    public Order(int orderId, String itemName, double itemPrice) {
        this.orderId = orderId;
        this.itemPrice = itemPrice;
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return "[" +
                "orderId=" + orderId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ']';
    }
}
