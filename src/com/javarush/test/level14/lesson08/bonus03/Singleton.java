package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Volodymyr Seleznov on 22.12.2015.
 */
public class Singleton
{
    private static final Singleton INSTANCE = new Singleton();
    private Singleton()
    {
    }

    public static Singleton getInstance()
    {
        return INSTANCE;
    }
}
