package exercicio_1;

public class Product {
    private String name;
    private double price;
    private int quantity;

    Product() {
        this.name = "";
        this.price = 0.0;
        this.quantity = 0;
    }

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    double calculateTotalValue() {
        return price * quantity;
    }

    void printProductInfo() {
        System.out.println("Name: " + name);
        System.out.printf("Price: $%.2f\n", price);
        System.out.println("Quantity: " + quantity);
    }
}
