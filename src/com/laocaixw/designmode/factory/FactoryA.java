package com.laocaixw.designmode.factory;

public class FactoryA implements IFactory {

    @Override
    public Product createProduct() {
        // 生产产品A
        return new ProductA();
    }

}
