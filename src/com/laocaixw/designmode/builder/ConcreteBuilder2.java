package com.laocaixw.designmode.builder;

public class ConcreteBuilder2 extends Builder {
    // 设置产品的不同部分
    @Override
    public void buildPart1() {
        product.addPart("Part1-型号A");
    }

    @Override
    public void buildPart2() {
        product.addPart("Part2-型号B");
    }

    @Override
    public void buildPart3() {
        product.addPart("Part3-型号C");
    }

    // ...
}
