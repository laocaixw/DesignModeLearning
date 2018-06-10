package com.laocaixw.designmode.builder;

public class ConcreteBuilder extends Builder {
    private Product product = new Product();

    // 设置产品的不同部分
    @Override
    public void buildPart1() {
        product.addPart("Part1");
    }

    @Override
    public void buildPart2() {
        product.addPart("Part2");
    }

    @Override
    public void buildPart3() {
        product.addPart("Part3");
    }

    // ...

    // 建造产品
    public Product getResult() {
        return product;
    }

}
