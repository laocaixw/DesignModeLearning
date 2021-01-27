package com.laocaixw.designmode.builder;

public class Director {
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product creat() {
        // 构建过程
        builder.buildPart1();
        builder.buildPart2();
        builder.buildPart3();

        // 可以统一处理依赖关系或约束条件等
        // ...

        return builder.getResult();
    }
}
