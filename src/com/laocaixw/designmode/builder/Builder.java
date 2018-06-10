package com.laocaixw.designmode.builder;

public abstract class Builder {
    // 设置产品的不同部分
    public abstract void buildPart1();

    public abstract void buildPart2();

    public abstract void buildPart3();

    // ...

    // 建造产品
    public abstract Product getResult();

}
