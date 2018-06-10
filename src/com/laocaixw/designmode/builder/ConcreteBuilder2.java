package com.laocaixw.designmode.builder;

public class ConcreteBuilder2 extends Builder {
    private Product product = new Product();

    // ���ò�Ʒ�Ĳ�ͬ����
    @Override
    public void buildPart1() {
        product.addPart("Part1-�ͺ�A");
    }

    @Override
    public void buildPart2() {
        product.addPart("Part2-�ͺ�B");
    }

    @Override
    public void buildPart3() {
        product.addPart("Part3-�ͺ�C");
    }

    // ...

    // �����Ʒ
    public Product getResult() {
        return product;
    }
}
