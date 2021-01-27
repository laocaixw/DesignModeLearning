package com.laocaixw.designmode.builder;

public abstract class Builder {
    protected final Product product;

    public Builder() {
        product = new Product();
    }

    // 设置产品的不同部分
    public abstract void buildPart1();

    public abstract void buildPart2();

    public abstract void buildPart3();

    // ...

    public Product getResult() {
        return product;
    }
}
