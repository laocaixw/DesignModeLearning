package com.laocaixw.designmode.composite;

public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void display(int level);
}
