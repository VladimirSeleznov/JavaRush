package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new FileReader(scanner.nextLine()));
        BufferedWriter out = new BufferedWriter(new FileWriter(scanner.nextLine()));
        scanner.close();

        List<String> list = new ArrayList<>();
        String s;
        while ((s = in.readLine()) != null) {
            list.add(s);
        }
        in.close();

        for (String str : list) {

            String[] split = str.split(" ");
            for (String item : split) {
                try {
                    Integer.parseInt(item);
                    out.write(item + " ");
                } catch (NumberFormatException e) {
                }
            }
        }
        out.close();
    }
}
