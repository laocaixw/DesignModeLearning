package com.laocaixw.designmode.decorator;

public class DecoratorBlack extends CarDecorator {
    public DecoratorBlack(Car car) {
        super(car);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("ºÚÉ«ÅçÆá");
    }
}
