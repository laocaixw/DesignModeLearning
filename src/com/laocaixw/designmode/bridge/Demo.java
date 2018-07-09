package com.laocaixw.designmode.bridge;

public class Demo {
    public static void main(String[] args) {
        Color color = new Red();
        // Color color = new Green();
        AbstractShape shape = new Circle(color);
        // AbstractShape shape = new Square(color);
        shape.draw();
    }
}
