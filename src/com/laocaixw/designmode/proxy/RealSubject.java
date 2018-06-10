package com.laocaixw.designmode.proxy;

public class RealSubject implements Subject {
    @Override
    public void request() {
        // ÒµÎñÂß¼­²Ù×÷...
        System.out.println("RealSubject-request");
    }
}
