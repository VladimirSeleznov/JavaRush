package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();
        scanner.close();
        Scanner fileScanner = new Scanner(new FileReader(file));
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (fileScanner.hasNext())
        {
            int x = fileScanner.nextInt();
            if (x % 2 == 0)
                numbers.add(x);
        }
        Collections.sort(numbers);
        for (int i : numbers)
        {
            System.out.println(i);
        }
    }
}