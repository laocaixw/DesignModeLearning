package com.laocaixw.designmode.builder;

public class ConcreteBuilder extends Builder {
    private Product product = new Product();

    // ���ò�Ʒ�Ĳ�ͬ����
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

    // �����Ʒ
    public Product getResult() {
        return product;
    }

}
