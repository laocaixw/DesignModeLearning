package com.laocaixw.designmode.flyweight;

public class ConcreteFlyweight implements Flyweight {
    private String innerState; // 内部状态

    ConcreteFlyweight(String innerState) {
        System.out.println("资源(" + innerState + ")被创建");
        this.innerState = innerState;
    }

    @Override
    public void operation(String outerState) {
        System.out.println("资源(" + innerState + ")执行外部操作(" + outerState + ")");
    }
}
