package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        isDateOdd("JANUARY 1 2000");
    }
    public static boolean isDateOdd(String date)
    {
        Date currentDate = new Date(date);
        int curYear = currentDate.getYear();
        Date startDate = new Date();
        startDate.setHours(0);
        startDate.setMinutes(0);
        startDate.setSeconds(0);
        startDate.setDate(-1);
        startDate.setMonth(0);
        startDate.setYear(curYear);
        long msDays = currentDate.getTime() - startDate.getTime();
        long Days = 24*60*60*1000;
        int countDays = (int) ((msDays/Days));
        boolean isDateOdd = !(countDays%2 ==0);
        return isDateOdd;
    }
}