package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber1 = reader.readLine();
        int nNumber1 = Integer.parseInt(sNumber1);
        String sNumber2 = reader.readLine();
        int nNumber2 = Integer.parseInt(sNumber2);

        for(int i =1; i <= nNumber1; i++)
        {
            for(int j = 1; j <= nNumber2; j++)
            {
                System.out.print(8);
            }
            System.out.println("");
        }


    }
}
