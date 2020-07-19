package com.protry.face;

import java.lang.reflect.InvocationTargetException;

/**
 * Java反射
 */
public class ReflectionTest {


    public static void main(String[] args) {

    }

    private static void test01() {
        try {
            final String instance = String.class.newInstance();
            System.out.println(instance);
            String a = "11";
            final String newInstance = a.getClass().newInstance();
            System.out.println(newInstance);

            final String hello = String.class.getConstructor(String.class).newInstance("Hello");
            System.out.println(hello);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
