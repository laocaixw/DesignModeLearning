package com.laocaixw.designmode.factory;

public class FactoryB implements IFactory {

    @Override
    public Product createProduct() {
        // ������ƷB
        return new ProductB();
    }

}
