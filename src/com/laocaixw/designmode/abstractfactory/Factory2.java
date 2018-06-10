package com.laocaixw.designmode.abstractfactory;

public class Factory2 implements Factory {

    @Override
    public ProductA createProductA() {
        // ������ƷA2
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        // ������ƷB2
        return new ProductB2();
    }

}
