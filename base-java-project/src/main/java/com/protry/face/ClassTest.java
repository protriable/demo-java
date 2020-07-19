package com.protry.face;

public class ClassTest {

    public static void main(String[] args) {
        final Class<String> stringClass = String.class;
        final Class<? extends String> aClass = "string".getClass();
        try {
            final Class<?> aClass1 = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
