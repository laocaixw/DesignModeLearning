package com.laocaixw.designmode.builder;

public abstract class Builder {
    // ���ò�Ʒ�Ĳ�ͬ����
    public abstract void buildPart1();

    public abstract void buildPart2();

    public abstract void buildPart3();

    // ...

    // �����Ʒ
    public abstract Product getResult();

}
