package com.laocaixw.designmode.singleton;

public class Singleton1 {
    private static Singleton1 mInstance = new Singleton1(); // ����ʽ

    // ���췽��˽�л�����֤����޷�ֱ��ʵ����
    private Singleton1() {
    }

    // ͨ���÷������ʵ������
    public static Singleton1 getInstance() {
        return mInstance;
    }
}
