package com.laocaixw.designmode.factory;

public class Demo {
    public static void main(String[] args) {
        Product product = Factory.createProduct("A");
        // Product product = Factory.createProduct("B");
        product.method();

        System.out.println("----------");

        IFactory factory = new FactoryA();
        // Factory factory = new FactoryB();
        Product product2 = factory.createProduct();
        product2.method();
    }
}
