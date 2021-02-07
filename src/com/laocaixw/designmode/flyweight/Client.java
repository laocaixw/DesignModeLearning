package com.laocaixw.designmode.flyweight;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory.getFlyweight("innerA").operation("outer1");
        FlyweightFactory.getFlyweight("innerB").operation("outer2");
        FlyweightFactory.getFlyweight("innerA").operation("outer3");
        FlyweightFactory.getFlyweight("innerA").operation("outer4");
        FlyweightFactory.getFlyweight("innerB").operation("outer5");
    }
}
