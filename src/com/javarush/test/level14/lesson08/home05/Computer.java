package com.javarush.test.level14.lesson08.home05;

/**
 * Created by Volodymyr Seleznov on 21.12.2015.
 */
public class Computer
{
    private Mouse mouse = new Mouse();
    private Keyboard keyboard = new Keyboard();
    private Monitor monitor = new Monitor();

    public Computer()
    {
    }

    public Mouse getMouse()
    {
        return mouse;
    }

    public Keyboard getKeyboard()
    {
        return keyboard;
    }

    public Monitor getMonitor()
    {
        return monitor;
    }
}
