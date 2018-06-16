package com.laocaixw.designmode.singleton;

public class Singleton1 {
    private static Singleton1 mInstance = new Singleton1(); // 饿汉式

    // 构造方法私有化，保证外界无法直接实例化
    private Singleton1() {
    }

    // 通过该方法获得实例对象
    public static Singleton1 getInstance() {
        return mInstance;
    }
}
