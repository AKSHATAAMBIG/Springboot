package org.example;

import java.util.Calendar;
import java.util.Date;

public class CalenderEx {
    public static Calendar firstDayOfLastWeek(Calendar c) {
        c = (Calendar) c.clone();
        // last week
        c.add(Calendar.WEEK_OF_YEAR, -1);
        // first day
        c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek());
        return c;
    }

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        System.out.println("First Day : " + firstDayOfLastWeek(calendar).getTime());
    }
}