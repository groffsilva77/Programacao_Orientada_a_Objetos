package exercicio_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Product System ===");

        System.out.println("Enter details for Product 1:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();

        System.out.print("Product price: $");
        double price1 = scanner.nextDouble();

        System.out.print("Product quantity: ");
        int quantity1 = scanner.nextInt();

        Product product1 = new Product(name1, price1, quantity1);
        scanner.nextLine();

        System.out.println("Enter details for Product 2:");
        System.out.print("Name: ");
        String name2 = scanner.nextLine();

        System.out.print("Product price: $");
        double price2 = scanner.nextDouble();

        System.out.print("Product quantity: ");
        int quantity2 = scanner.nextInt();

        Product product2 = new Product(name2, price2, quantity2);
        scanner.nextLine();

        System.out.println("Enter details for Product 3:");
        System.out.print("Name: ");
        String name3 = scanner.nextLine();

        System.out.print("Product price: $");
        double price3 = scanner.nextDouble();

        System.out.print("Product quantity: ");
        int quantity3 = scanner.nextInt();

        Product product3 = new Product(name3, price3, quantity3);
        scanner.nextLine();

        System.out.println("--- Product System ---");
        product1.printProductInfo();
        System.out.printf("Total value: $%.2f\n", product1.calculateTotalValue());
        product2.printProductInfo();
        System.out.printf("Total value: $%.2f\n", product2.calculateTotalValue());
        product3.printProductInfo();
        System.out.printf("Total value: $%.2f\n", product3.calculateTotalValue());

        System.out.printf("Total stock value: $%.2f\n", product1.calculateTotalValue() + product2.calculateTotalValue() + product3.calculateTotalValue());

        scanner.close();
    }
}
