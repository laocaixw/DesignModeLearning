package com.laocaixw.designmode.composite;

import java.util.ArrayList;

public class Composite extends Component {
    int level = 0;

    public Composite(String name) {
        super(name);
    }

    private ArrayList<Component> componentList = new ArrayList<>();

    public void add(Component component) {
        this.componentList.add(component);
    }

    public void remove(Component component) {
        this.componentList.remove(component);
    }

    public ArrayList<Component> getChild() {
        return this.componentList;
    }

    @Override
    public void display(int level) {
        this.level = level + 1;
        System.out.println(name);
        for (Component component : componentList) {
            for (int i = 0; i <= level; i++) {
                System.out.print("-");
            }
            component.display(this.level);
        }
    }
}
