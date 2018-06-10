package com.laocaixw.designmode.proxy;

public class ProxySubject implements Subject {
    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        // ����ǰ������Щ��������...
        System.out.println("ProxySubject-before-request");
        subject.request();
        // �����Ҳ������Щ��������...
        System.out.println("ProxySubject-after-request");
    }
}
