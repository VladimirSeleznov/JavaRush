package com.javarush.test.level08.lesson11.home05;

import com.sun.org.apache.xpath.internal.operations.Equals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        char[] charArray = n.toCharArray();
        charArray[0] = Character.toTitleCase(charArray[0]);
        for (int i = 0; i < charArray.length-1; i++) {
            if (charArray[i] == ' ' && charArray[i+1] != ' ') {
                charArray[i+1] = Character.toTitleCase(charArray[i+1]);
            }
        }
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]);
        }
    }


}
