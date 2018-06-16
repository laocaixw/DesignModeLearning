package com.laocaixw.designmode.decorator;

public class DecoratorGPS extends CarDecorator {
    public DecoratorGPS(Car car) {
        super(car);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("安装GPS");
    }
}
