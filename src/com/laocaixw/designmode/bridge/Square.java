package com.laocaixw.designmode.bridge;

// 具体形状-正方形
public class Square extends AbstractShape {
    public Square(Color imp) {
        super(imp);
    }

    @Override
    public String getShapeName() {
        return "正方形";
    }
}
