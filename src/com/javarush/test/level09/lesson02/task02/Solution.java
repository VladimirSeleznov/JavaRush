package com.javarush.test.level09.lesson02.task02;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static String method1()
    {
        method2();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String meth = stackTraceElement[2].getMethodName();
        System.out.println(meth);
        return meth;
    }

    public static String method2()
    {
        method3();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String meth = stackTraceElement[2].getMethodName();
        System.out.println(meth);
        return meth;

    }

    public static String method3()
    {
        method4();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String meth = stackTraceElement[2].getMethodName();
        System.out.println(meth);
        return meth;

    }

    public static String method4()
    {
        method5();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String meth = stackTraceElement[2].getMethodName();
        System.out.println(meth);
        return meth;

    }

    public static String method5()
    {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String meth = stackTraceElement[2].getMethodName();
        System.out.println(meth);
        return meth;

    }
}