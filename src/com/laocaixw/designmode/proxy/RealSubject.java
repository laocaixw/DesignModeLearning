package com.laocaixw.designmode.proxy;

public class RealSubject implements Subject {
    @Override
    public void request() {
        // ҵ���߼�����...
        System.out.println("RealSubject-request");
    }
}
