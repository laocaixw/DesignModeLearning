package com.laocaixw.designmode.factory;

public class FactoryB implements IFactory {

    @Override
    public Product createProduct() {
        // 生产产品B
        return new ProductB();
    }

}
