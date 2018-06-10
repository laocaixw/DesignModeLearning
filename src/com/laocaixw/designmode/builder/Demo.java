package com.laocaixw.designmode.builder;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();
        director.creat(builder);
        Product product = builder.getResult();
        product.show();

        System.out.println("----------");

        Director director2 = new Director();
        Builder builder2 = new ConcreteBuilder2();
        director2.creat(builder2);
        Product product2 = builder2.getResult();
        product2.show();
    }
}
