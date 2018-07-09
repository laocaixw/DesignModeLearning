package com.laocaixw.designmode.bridge;

// 抽象形状
public abstract class AbstractShape {
    private Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public abstract String getShapeName();

    public void draw() {
        System.out.println("使用" + color.getColor() + "画" + getShapeName());
    }
}
