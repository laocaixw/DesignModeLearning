package com.laocaixw.designmode.singleton;

public class Singleton3 {
    private static Singleton3 mInstance = null; // ����ʽ��˫�طǿ��ж�

    private Singleton3() {
    }

    // ˫�طǿ��жϣ��Ա�֤�������е�Ч��
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
