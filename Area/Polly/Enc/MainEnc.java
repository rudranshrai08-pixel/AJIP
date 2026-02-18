class Product {
   private int pid;
    private String product_name;
    private double price;
    private int quantity;
    public Product(int pid, String product_name, double price, int quantity) {
        super();
        this.pid = pid;
        this.product_name = product_name;
        this.price = price;
        this.quantity = quantity;
    }
     public int getPid() {
        return pid;
    }

    public String getProduct_name() {
        return product_name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

}







public class MainEnc {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 85000, 10);
        String result = String.format("Pid=%d, ProductName=%s, Price=%.2f, Quantity=%d",
                p1.getPid(), p1.getProduct_name(), p1.getPrice(), p1.getQuantity());
        System.out.println(result);
    }
}