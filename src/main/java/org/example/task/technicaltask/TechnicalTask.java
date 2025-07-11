package org.example.task.technicaltask;

public class TechnicalTask {

    public static void main(String[] args) {
        Product product1 = new Product("T-shirt", 120.99, "Zara", 12);
        Product product2 = new Product("Cap", 49.99, "Champion", 0);
        Product product3 = new Product("Shoes", 200.00, "Nike", 100);
        Product product4 = new Product("Bag", 569.99, "Gucci", 66);
        Product[] productArray = {product1, product2, product3, product4};
        Store store = new Store("Men", "28 May", productArray);

        store.printAllProducts(); System.out.println();
        store.printExpensiveProducts(50); System.out.println();
        store.applyDiscountToAll(10); System.out.println();
        product2.isInStock();
    }
}