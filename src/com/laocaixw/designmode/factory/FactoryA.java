package com.laocaixw.designmode.factory;

public class FactoryA implements IFactory {

    @Override
    public Product createProduct() {
        // ������ƷA
        return new ProductA();
    }

}
