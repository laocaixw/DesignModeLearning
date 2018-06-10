package com.laocaixw.designmode.decorator;

public abstract class CarDecorator implements Car {
    private Car car = null;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void show() {
        if (car != null) {
            car.show();
        }
    }
}
