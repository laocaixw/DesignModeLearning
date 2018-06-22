package com.laocaixw.designmode.composite;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void display(int level) {
        System.out.println(name);
    }
}
