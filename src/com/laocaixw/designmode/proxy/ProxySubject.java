package com.laocaixw.designmode.proxy;

public class ProxySubject implements Subject {
    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        // 请求前可以做些其他操作...
        System.out.println("ProxySubject-before-request");
        subject.request();
        // 请求后也可以做些其他操作...
        System.out.println("ProxySubject-after-request");
    }
}
