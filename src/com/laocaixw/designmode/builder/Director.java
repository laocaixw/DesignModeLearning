package com.laocaixw.designmode.builder;

public class Director {
    public void creat(Builder builder) {
        builder.buildPart1();
        builder.buildPart2();
        builder.buildPart3();
    }
}
