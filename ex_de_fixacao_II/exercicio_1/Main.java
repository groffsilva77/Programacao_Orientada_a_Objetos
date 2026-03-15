import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String nameProd1, nameProd2, nameProd3;
        double priceProd1, priceProd2, priceProd3;
        int quanProd1, quanProd2, quanProd3;
        Scanner scanner = new Scanner(System.in);
        printMessage();

        System.out.print("Product 1 name: ");
        nameProd1 = scanner.next();
        System.out.print("Product 1 price: ");
        priceProd1 = scanner.nextDouble();
        System.out.print("Product 1 quantity: ");
        quanProd1 = scanner.nextInt();

        System.out.print("Product 2 name: ");
        nameProd2 = scanner.next();
        System.out.print("Product 2 price: ");
        priceProd2 = scanner.nextDouble();
        System.out.print("Product 2 quantity: ");
        quanProd2 = scanner.nextInt();

        System.out.print("Product 3 name: ");
        nameProd3 = scanner.next();
        System.out.print("Product 3 price: ");
        priceProd3 = scanner.nextDouble();
        System.out.print("Product 3 quantity: ");
        quanProd3 = scanner.nextInt();

        System.out.println("Product 1: " + nameProd1);
        System.out.println("Price 1: " + priceProd1);
        System.out.println("Quantity 1: " + quanProd1);

        System.out.println("Product 2: " + nameProd2);
        System.out.println("Price 2: " + priceProd2);
        System.out.println("Quantity 2: " + quanProd2);

        System.out.println("Product 3: " + nameProd3);
        System.out.println("Price 3: " + priceProd3);
        System.out.println("Quantity 3: " + quanProd3);

        double totalValue1 = priceProd1 * quanProd1;
        double totalValue2 = priceProd2 * quanProd2;
        double totalValue3 = priceProd3 * quanProd3;

        System.out.printf("Value of product 1: %.2f\n", totalValue1);
        System.out.printf("Value of product 2: %.2f\n", totalValue2);
        System.out.printf("Value of product 3: %.2f\n", totalValue3);

        double totalValue = totalValue1 + totalValue2 + totalValue3;

        System.out.printf("Total value of products: %.2f\n", totalValue);
    }
    
    public static void printMessage() {
        System.out.println("=== Welcome to the product registration system ===");
    }
}