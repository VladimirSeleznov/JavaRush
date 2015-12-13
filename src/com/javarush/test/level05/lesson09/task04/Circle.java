package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    //напишите тут ваш код
    int radius;
    int centerX;
    int centerY;
    int width;
    String color;

    public Circle(int radius, int centerX, int centerY)
    {
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public Circle(int width, int centerY, int centerX, int radius)
    {
        this.width = width;
        this.centerY = centerY;
        this.centerX = centerX;
        this.radius = radius;
    }

    public Circle(int radius, int centerX, int centerY, int width, String color)
    {
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
        this.width = width;
        this.color = color;
    }
}
