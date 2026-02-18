
import java.util.ArrayList;

class Product {

    int id;
    String name;
    double price;
    int par2;

    Product(int id, String name, int price, int par2) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.par2 = par2;
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<Product> productList = new ArrayList<>();
        
        productList.add(new Product(1, "Laptop", 55000, 5));
        productList.add(new Product(2, "Mobile", 20000, 10));
        productList.add(new Product(3, "Tablet", 30000, 7));
        productList.add(new Product(4, "Headphones", 2000, 15));
        productList.add(new Product(5, "Smartwatch", 5000, 8));
        productList.add(new Product(6, "Buds", 1200, 2));
        productList.add(new Product(7, "Earphones", 1500, 3));
        productList.add(new Product(8, "Keyboard", 2000, 5));
        productList.add(new Product(9, "Mouse", 800, 10));
        productList.add(new Product(10, "Monitor", 12000, 4));

        System.out.printf("%-10s %-20s %-10s %-10s%n", "ID", "Product Name", "Price", "Quantity");
        for (Product p : productList) {
            System.out.printf("%-10d %-20s %-10.2f %-10d%n", p.id, p.name, p.price, p.par2);
        }

    }
}
