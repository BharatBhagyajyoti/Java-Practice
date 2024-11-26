package nareshit.lab.dt26_11_24.q2;

public class Order {
    private String orderId;
    private String productName;

    public Order(String orderId, String productName) {
        this.orderId = orderId;
        this.productName = productName;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return  '\'' +orderId + '\'' +
                ", productName='" + productName + '\'' +
                '}';
    }
}
