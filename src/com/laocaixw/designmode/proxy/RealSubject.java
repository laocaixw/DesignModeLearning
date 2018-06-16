package com.laocaixw.designmode.proxy;

public class RealSubject implements Subject {
    @Override
    public void request() {
        // 业务逻辑操作...
        System.out.println("RealSubject-request");
    }
}
