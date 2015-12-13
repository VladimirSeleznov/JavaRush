package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> max = new ArrayList<String>();
        String maxOne = "";
        max.add(maxOne);
        for (int i = 0; i < 5; i++)
        {
            String s = reader.readLine();
            list.add(s);
            if (s.length() == max.get(0).length())
            {
                max.add(s);
            }
            if (s.length() > max.get(0).length())
            {
                max = null;
                max = new ArrayList<String>();
                max.add(s);
            }

        }
        for (int i = 0; i < max.size(); i++)
        {
            System.out.println(max.get(i));
        }
    }
}
