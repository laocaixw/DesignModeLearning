package com.laocaixw.designmode.abstractfactory;

public class Factory1 implements Factory {

    @Override
    public ProductA createProductA() {
        // 生产产品A1
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        // 生产产品B1
        return new ProductB1();
    }

}
