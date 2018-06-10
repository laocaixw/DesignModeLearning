package com.laocaixw.designmode.abstractfactory;

public class Demo {
    public static void main(String[] args) {
        Factory factory = new Factory1();
        // Factory factory = new Factory2();
        ProductA product = factory.createProductA();
        // ProductB product = factory.createProductB();
        product.method();
    }
}
