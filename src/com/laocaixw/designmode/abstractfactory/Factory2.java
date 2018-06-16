package com.laocaixw.designmode.abstractfactory;

public class Factory2 implements Factory {

    @Override
    public ProductA createProductA() {
        // 生产产品A2
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        // 生产产品B2
        return new ProductB2();
    }

}
