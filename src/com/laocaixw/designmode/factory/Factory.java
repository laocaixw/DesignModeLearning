package com.laocaixw.designmode.factory;

public class Factory {
    public static Product createProduct(String productType) {
        if ("A".equals(productType)) {
            return new ProductA();
        } else if ("B".equals(productType)) {
            return new ProductB();
        } else {
            return null;
        }
    }
}
