package org.example.task.technicaltask;

public class Store {
    public String name;
    public String address;
    public Product[] products;

    public Store(String name, String address, Product[] products) {
        this.name = name;
        this.address = address;
        this.products = products;
    }

    public void printAllProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void printExpensiveProducts(double limit) {
        for (Product product : products) {
            if (product.price > limit) {
                System.out.println(product);
            }
        }
    }

    public void applyDiscountToAll(double percent) {
        for (Product product : products) {
            product.price = product.discountPrice(percent);
            System.out.printf("%s: %.2f\n", product.name, product.price);
        }
    }
}