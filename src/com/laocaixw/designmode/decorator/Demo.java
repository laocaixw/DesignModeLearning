package com.laocaixw.designmode.decorator;

public class Demo {
    public static void main(String[] args) {
        Car benz = new Benz();
        CarDecorator black = new DecoratorBlack(benz);
        CarDecorator gps = new DecoratorGPS(black);
        gps.show();
    }
}
