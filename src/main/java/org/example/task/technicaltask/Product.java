package org.example.task.technicaltask;

public class Product {
    public String name;
    public double price;
    public String category;
    public int stock;

    public Product(String name, double price, String category, int stock) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }

    public String toString() {
        return "Product{name=%s, price=%s, category=%s, stock=%s}".formatted(name, price, category, stock);
    }

    public double discountPrice(double percent) {
        return price - (price * percent / 100);
    }

    public boolean isInStock() {
        return stock > 0;
    }
}
