package com.laocaixw.designmode.abstractfactory;

public interface Factory {
    public ProductA createProductA(); // 生产品牌A的产品

    public ProductB createProductB(); // 生产品牌B的产品
}
