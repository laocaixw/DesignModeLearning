package com.laocaixw.designmode.singleton;

public class Singleton2 {
    private static Singleton2 mInstance = null; // ����ʽ

    private Singleton2() {
    }

    // ����ͬ����ȷ�����̻߳�����ֻ����һ��ʵ��
    synchronized public static Singleton2 getInstance() {
        if (mInstance == null) {
            mInstance = new Singleton2();
        }
        return mInstance;
    }
}
