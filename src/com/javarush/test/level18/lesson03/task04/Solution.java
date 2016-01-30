package com.javarush.test.level18.lesson03.task04;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, Integer> integerHashMap = new HashMap<>();
        int minByte = 0;

        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        scanner.close();

        FileInputStream fileInputStream = new FileInputStream(fileName);

        while (fileInputStream.available() > 0) {
            int currentByte = fileInputStream.read();

            minByte = currentByte;

            if (!integerHashMap.containsKey(currentByte)) {
                integerHashMap.put(currentByte, 1);
            } else {
                integerHashMap.put(currentByte, integerHashMap.get(currentByte) + 1);
            }
        }

        fileInputStream.close();

        int minCount = integerHashMap.get(minByte);

        for (Map.Entry<Integer, Integer> entry : integerHashMap.entrySet()) {

            if (entry.getValue() < minCount) {
                minByte = entry.getKey();
                minCount = entry.getValue();
            }
        }

        System.out.print(minByte);

        for (Map.Entry<Integer, Integer> entry : integerHashMap.entrySet()) {
            if (Objects.equals(entry.getValue(), integerHashMap.get(minByte))) {
                if (!entry.getKey().equals(minByte)) {
                    System.out.print(" " + entry.getKey());
                }
            }
        }
    }
}
