    package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        s = Capitalize(s);
        System.out.println(s);
    }
    public static String Capitalize(String string)
    {
        char[] chars = string.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        for (int i = 0; i < chars.length; i++)
        {
            if (chars[i] == ' ')
            {
                chars[i+1] = Character.toUpperCase(chars[i+1]);
            }
        }
        String b = String.valueOf(chars);
        return b;
    }
}
