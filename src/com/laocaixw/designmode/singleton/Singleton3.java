package com.laocaixw.designmode.singleton;

public class Singleton3 {
    private static Singleton3 mInstance = null; // 懒汉式，双重非空判断

    private Singleton3() {
    }

    // 双重非空判断，以保证程序运行的效率
    public static Singleton3 getInstance() {
        if (mInstance == null) {
            synchronized (Singleton3.class) {
                if (mInstance == null) {
                    mInstance = new Singleton3();
                }
            }
        }
        return mInstance;
    }
}
