package com.javarush.test.level16.lesson03.task03;

import java.util.ArrayList;
import java.util.List;

/* Список и нити
В методе main добавить в статический объект list 5 нитей SpecialThread - различных объектов.
*/

public class Solution
{
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args)
    {
        SpecialThread specialThread = new SpecialThread();
        Thread thread = new Thread(specialThread);
        list.add(thread);
        SpecialThread specialThread1 = new SpecialThread();
        Thread thread1 = new Thread(specialThread);
        list.add(thread1);
        SpecialThread specialThread2 = new SpecialThread();
        Thread thread2 = new Thread(specialThread);
        list.add(thread2);
        SpecialThread specialThread3 = new SpecialThread();
        Thread thread3 = new Thread(specialThread);
        list.add(thread3);
        SpecialThread specialThread4 = new SpecialThread();
        Thread thread4 = new Thread(specialThread);
        list.add(thread4);
    }

    public static class SpecialThread implements Runnable
    {
        public void run()
        {
            System.out.println("it's run method inside SpecialThread");
        }
    }
}
