package com.laocaixw.designmode.adapter;

public class Demo {
    public static void main(String[] args) {
        Target target = new Adapter();
        // Target target = new Adapter2(new Adaptee());
        target.request();
    }
}
