package com.wzb.pattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PatternTest {
    public static void main(String[] args) {
        try {
            HungrySingletonPattern instance = HungrySingletonPattern.getInstance();
            Constructor<HungrySingletonPattern> declaredConstructor = HungrySingletonPattern.class.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            HungrySingletonPattern reflactInstance = declaredConstructor.newInstance();
            System.out.println(instance);
            System.out.println(reflactInstance);
            System.out.println(instance==reflactInstance);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
