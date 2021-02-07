package com.laocaixw.designmode.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<String, Flyweight> pool = new HashMap<>();

    // 私有构造方法
    private FlyweightFactory() {
    }

    public static Flyweight getFlyweight(String innerState) {
        if (!pool.containsKey(innerState)) {
            Flyweight flyweight = new ConcreteFlyweight(innerState);
            pool.put(innerState, flyweight);
            return flyweight;
        }
        return pool.get(innerState);
    }
}
