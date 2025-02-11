package nareshit.lab.dt11_01_25_Collection.q1;

public class Product implements Comparable<Product>{
    private int productNumber;
    private String productName;
    private double productPrice;

    public Product(int productNumber, String productName, double productPrice) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.productPrice = productPrice;
    }



    @Override
    public int compareTo(Product o) {
        return this.productName.compareTo(o.productName);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNumber=" + productNumber +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
