package com.protry.ref;

import com.protry.invocate.Day;
import com.protry.invocate.DayImpl;
import com.protry.invocate.MyInvocationHandler;

import java.lang.reflect.*;

public class DemoOne {

    public static void main(String[] args) {
        test6();
    }


    private static void test9() {
        //JDK 动态代理只能基于Interface
        final Day day = new DayImpl();
        final MyInvocationHandler myInvocationHandler = new MyInvocationHandler(day);
        final Day dayProxy = (Day) Proxy.newProxyInstance(day.getClass().getClassLoader(), day.getClass().getInterfaces(), myInvocationHandler);
        dayProxy.datTest();
    }

    private static void test8() {
        try {
            final Class<?> aClass = Class.forName("com.protry.ref.User");
            final User user = (User) aClass.newInstance();
            user.setAddress("杭州");
            user.setPassword("123");
            user.setUsername("张三");

            final Method[] declaredMethods = aClass.getDeclaredMethods();
            for (Method declaredMethod : declaredMethods) {
                System.out.println(declaredMethod.getName());
            }
        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void test7() {
        try {
            final Class<?> aClass = Class.forName("com.protry.ref.User");
            final User user = (User) aClass.newInstance();
            user.setAddress("杭州");
            user.setPassword("123");
            user.setUsername("张三");

            final Method getFullInfoMethod = aClass.getDeclaredMethod("getFullInfo");
            getFullInfoMethod.setAccessible(true);
            getFullInfoMethod.invoke(user);


            final Method getInfoByPublic = aClass.getDeclaredMethod("getInfoByPublic", String.class);
            getInfoByPublic.setAccessible(true);
            getInfoByPublic.invoke(user, "invokeUserName");

        } catch (IllegalAccessException | InstantiationException |
                ClassNotFoundException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    private static void test6() {
        try {
            final Class<?> aClass = Class.forName("com.protry.ref.User");
            final User user = (User) aClass.newInstance();
            user.setAddress("杭州");
            user.setPassword("123");
            user.setUsername("张三");

            final Field[] declaredFields = aClass.getDeclaredFields();
            for (Field declaredField : declaredFields) {
                declaredField.setAccessible(true);
                System.out.println(declaredField.get(user));
                System.out.println(declaredField.getType().getName());
            }
        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void test5() {
        try {
            final Class<?> aClass = Class.forName("com.protry.ref.User");
            final User user = (User) aClass.newInstance();
            final Field usernameField = aClass.getDeclaredField("username");
            usernameField.setAccessible(true);
            usernameField.set(user, "张三");
            System.out.println(user);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private static void test4() {
        try {
            final Class<?> aClass = Class.forName("com.protry.ref.User");
            final Constructor<?>[] constructors = aClass.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                final Class<?>[] parameterTypes = constructor.getParameterTypes();
                System.out.println( "构造器名字一样" + constructor.getName()
                        + "该构造器带有" + parameterTypes.length + "个参数");
                for (Class<?> parameterType : parameterTypes) {
                    System.out.print("参数类型名称:" + parameterType.getName() + " ");
                }
                System.out.println();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void test3() {
        try {
            final Class<?> aClass = Class.forName("com.protry.ref.User");
            final Constructor<?>[] constructors = aClass.getConstructors();
            for (Constructor<?> constructor : constructors) {
                final Class<?>[] parameterTypes = constructor.getParameterTypes();
                System.out.println( "构造器名字一样" + constructor.getName()
                    + "该构造器带有" + parameterTypes.length + "个参数");
                for (Class<?> parameterType : parameterTypes) {
                    System.out.print("参数类型名称:" + parameterType.getName() + " ");
                }
                System.out.println();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void test1() {

        //根据类名：类名.class
        final Class<String> stringClass = String.class;
        //根据对象：对象.getClass()
        String a = "a";
        final Class<? extends String> aClass = a.getClass();
        //根据全限定类名
        try {
            final Class<?> string = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void test2() {
        final Class<User> userClass = User.class;
        try {
            final Constructor<User> constructor = userClass.getConstructor(String.class, String.class, String.class);
            final User user = constructor.newInstance("张三", "123", "上海");
            System.out.println(user);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
