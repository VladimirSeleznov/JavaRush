package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            list.add(scanner.next());
        }
        int length = 0;
        for (int i = 0; i < 5; i++) {
            if (list.get(i).length() > length){
                length = list.get(i).length();
            }
        }


        for (int i = 0; i < 5; i++) {
            if(list.get(i).length() == length){
                System.out.println(list.get(i));
            }
        }

    }
}
