package onlineStore;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product.Builder()
                .name("Laptop")
                .description("Gaming Laptop")
                .price(1200.00)
                .stockQuantity(5)
                .build();

        Product smartphone = new Product.Builder()
                .name("Smartphone")
                .description("Latest Model Smartphone")
                .price(800.00)
                .stockQuantity(10)
                .build();

        System.out.println("Products:");
        System.out.println(laptop);
        System.out.println(smartphone);

        List<Product> products = new ArrayList<>();
        products.add(laptop);
        products.add(smartphone);

        Customer customer = new Customer("John", "Doe", "john.doe@example.com", "123-456-7890");

        Order order = new Order("ORD12345", customer);
        order.addProduct(laptop);
        order.addProduct(smartphone);

        double totalAmount = order.getTotalAmount();

        System.out.println("\nOrder Details:");
        System.out.println("Order Number: " + order.getOrderNumber());
        System.out.println("Order Date: " + order.getOrderDate());
        System.out.println("Customer: " + customer.getFirstName() + " " + customer.getLastName());
        System.out.println("Total Amount: " + totalAmount);

        System.out.println("\nOrdered Products:");
        for (Product product : order.getProducts()) {
            System.out.println(product);
        }
    }
}
