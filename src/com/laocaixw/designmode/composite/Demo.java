package com.laocaixw.designmode.composite;

public class Demo {
    public static void main(String[] args) {
        // 根节点（树枝root）
        Composite root = new Composite("root");
        // 根节点可以长出叶子A、B
        root.add(new Leaf("A"));
        root.add(new Leaf("B"));
        // 根节点也可以长出树枝X
        Composite x = new Composite("X");
        // 树枝X可以长出叶子XA、XB
        x.add(new Leaf("XA"));
        x.add(new Leaf("XB"));
        // 树枝X也可以长出树枝XX
        Composite xx = new Composite("XX");
        // 树枝XX还可以接着长出叶子XXA
        xx.add(new Leaf("XXA"));
        x.add(xx);
        root.add(x);
        root.display(0);
    }
}
