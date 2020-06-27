package com.protry.face;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author shaobin
 * @version : ExceptionTest.java, v 0.1 2020年06月25日 12:56 下午 shaobin Exp $
 */
public class ExceptionTest {

    public static void main(String[] args) {

        new ExceptionTest().test6();
    }

    private void test6() {
        try {
            try {
                throw new Sneeze();
            }
            catch ( Annoyance a ) {
                System.out.println("Caught Annoyance");
                throw a;
            }
        }
        catch ( Sneeze s ) {
            System.out.println("Caught Sneeze");
            return ;
        }
        finally {
            System.out.println("Hello World!");
        }
    }

    class Annoyance extends Exception {}
    class Sneeze extends Annoyance {}

    private static void test5() {
        List<String> list = null;
        System.out.println(list.get(0));
    }

    private static void test4() {
        int[] ints = new int[5];
        ints[5] = 2;
        List<String> list = new ArrayList<>();
        list.get(2);
    }

    private static void test3() {
        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = df.format(day);

        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM");
        String format = dateFormat.format(date);
        System.out.println(format);
    }

    private static void test2() {
        Object a = "12a";
        int d = (int)a;
        System.out.println(d);
    }

    private static void test1() {
        int a = 10;
        int b = 0;
        System.out.println(a/b);
    }
}