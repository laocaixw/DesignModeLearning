package com.laocaixw.designmode.proxy;

public class Demo {

    public static void main(String[] args) {
        RealSubject real = new RealSubject();
        ProxySubject proxy = new ProxySubject(real);
        proxy.request();
    }

}
