package com.laocaixw.designmode.builder;

public class Demo {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
//        Builder builder = new ConcreteBuilder2();
        Director director = new Director(builder);
        Product product = director.creat();
        product.show();
    }
}
