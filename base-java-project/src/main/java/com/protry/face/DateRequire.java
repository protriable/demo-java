/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.face;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @author shaobin
 * @version : DateRequire.java, v 0.1 2020年06月25日 10:05 上午 shaobin Exp $
 */
public class DateRequire {

    public static void main(String[] args) {
        test2();
    }


    private static void test2() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE ,-1);
        System.out.println(calendar.getTime());

        LocalDateTime today = LocalDateTime.now();
        LocalDateTime yesterday = today.minusDays(1);
        System.out.println(yesterday);
    }

    private static void test1() {
        Calendar calendar = Calendar.getInstance();
        //年
        System.out.println("年：" + calendar.get(Calendar.YEAR));
        //月
        System.out.println("月: " + (calendar.get(Calendar.MONTH) + 1));
        //日
        System.out.println("日: " + calendar.get(Calendar.DATE));
        //小时
        System.out.println("时: " + calendar.get(Calendar.HOUR));
        //分
        System.out.println("分: " + calendar.get(Calendar.MINUTE));
        //秒
        System.out.println("秒: " + calendar.get(Calendar.SECOND));

        //Java 8
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());


        System.out.println(System.currentTimeMillis());
        System.out.println(Calendar.getInstance().getTimeInMillis());
        System.out.println(Clock.systemDefaultZone().millis()); //java8

        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        System.out.println(dateFormat.format(date));

        //java8
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime.format(timeFormatter));
    }
}