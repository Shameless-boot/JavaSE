package com.sean.mashibin.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        System.out.println(str);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
    }
}
