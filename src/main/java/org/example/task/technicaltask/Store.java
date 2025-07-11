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
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }

    public void printExpensiveProducts(double limit) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].price > limit) {
                System.out.println(products[i]);
            }
        }
    }

    public void applyDiscountToAll(double percent) {
        for (int i = 0; i < products.length; i++) {
            products[i].price = products[i].discountPrice(percent);
            System.out.printf("%s: %.2f\n", products[i].name, products[i].price);
        }
    }
}