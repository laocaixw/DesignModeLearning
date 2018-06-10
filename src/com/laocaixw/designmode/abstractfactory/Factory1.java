package com.laocaixw.designmode.abstractfactory;

public class Factory1 implements Factory {

    @Override
    public ProductA createProductA() {
        // ������ƷA1
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        // ������ƷB1
        return new ProductB1();
    }

}
