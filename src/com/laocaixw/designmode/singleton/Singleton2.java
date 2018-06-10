package com.laocaixw.designmode.singleton;

public class Singleton2 {
    private static Singleton2 mInstance = null; // 懒汉式

    private Singleton2() {
    }

    // 方法同步，确保多线程环境下只创建一个实例
    synchronized public static Singleton2 getInstance() {
        if (mInstance == null) {
            mInstance = new Singleton2();
        }
        return mInstance;
    }
}
