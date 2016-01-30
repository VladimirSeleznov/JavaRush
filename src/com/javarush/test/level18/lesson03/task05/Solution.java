package com.javarush.test.level18.lesson03.task05;

import java.io.FileInputStream;
import java.util.*;

/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Set<Integer> bytes = new TreeSet<>();

        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        scanner.close();

        FileInputStream fileInputStream = new FileInputStream(fileName);

        while (fileInputStream.available() > 0) {
            bytes.add(fileInputStream.read());
        }

        fileInputStream.close();

        for (int i : bytes) {
            System.out.print(i + " ");
        }
    }
}
