package com.javarush.test.level04.lesson13.task03;

import java.io.*;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        for(int j =1; j <= 10; j++)
        {
            for (int i = 1; i <= j; i++)
            {
                System.out.print(8);
            }
            System.out.println("");
        }

    }
}
