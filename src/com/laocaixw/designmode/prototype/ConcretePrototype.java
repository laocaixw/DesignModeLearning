package com.laocaixw.designmode.prototype;

public class ConcretePrototype implements Prototype {
    private String type;
    private String name;
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void show(){
        System.out.println("Type:" + type + ",Name:" + name);
    }

    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

}
