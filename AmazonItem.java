public class AmazonItem {
    private String productID;
    private String name;
    private String category;
    private String price;

    public AmazonItem(String productID, String name, String category, String price) {
        this.productID = productID;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getProductID() {
        return productID;
    }

    public String toString() {
        return "Product ID: " + productID + ", Name: " + name +
                ", Category: " + category + ", Price: $" + price;
    }
}

