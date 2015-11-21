package com.javarush.test.level07.lesson12.home03;

import java.io.IOException;

import java.util.*;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {


        int  maximum;
        int  minimum;

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 20; i++) {
            list.add(scanner.nextInt());
        }

        maximum = Collections.max(list);
        minimum = Collections.min(list);


        System.out.println(maximum);
        System.out.println(minimum);
    }
}
