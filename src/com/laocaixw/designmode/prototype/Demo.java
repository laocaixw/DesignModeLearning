package com.laocaixw.designmode.prototype;

public class Demo {
    
    public static void main(String[] args) {
        ConcretePrototype c1 = new ConcretePrototype();
        c1.setType("Type-A");
        c1.setName("Name-1");
        c1.show();
        ConcretePrototype c2 = (ConcretePrototype) c1.clone();
        c2.setName("Name-2");
        c2.show();
        c1.setType("Type-B");
        c1.show();
        c2.show();
    }

}
