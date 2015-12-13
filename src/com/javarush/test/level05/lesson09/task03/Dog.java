package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    int height;
    String name;
    String color;

    public Dog(int height, String name, String color)
    {
        this.height = height;
        this.name = name;
        this.color = color;
    }

    public Dog(String name, int height)
    {
        this.name = name;
        this.height = height;
    }

    public Dog(String name)
    {
        this.name = name;
    }
}
