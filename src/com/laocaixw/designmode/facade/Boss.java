package com.laocaixw.designmode.facade;

public class Boss {
    public static void main(String[] args) {
        // 老板告诉秘书要去深圳出差10天，请8个人吃饭
        Secretary secretary = new Secretary();
        secretary.trip("深圳", 10);
        System.out.println("----------");
        secretary.repast(8);
    }
}
