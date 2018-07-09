package com.laocaixw.designmode.bridge;

// 具体形状-圆形
public class Circle extends AbstractShape {
    public Circle(Color imp) {
        super(imp);
    }

    @Override
    public String getShapeName() {
        return "圆形";
    }
}
