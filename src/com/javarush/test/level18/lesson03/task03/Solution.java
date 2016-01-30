package com.javarush.test.level18.lesson03.task03;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        HashMap<Integer, Integer> integerHashMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        scanner.close();

        FileInputStream fileInputStream = new FileInputStream(fileName);

        while (fileInputStream.available() > 0) {
            int currentByte = fileInputStream.read();

            if (!integerHashMap.containsKey(currentByte)) {
                integerHashMap.put(currentByte, 1);
            } else {
                integerHashMap.put(currentByte, integerHashMap.get(currentByte) + 1);
            }
        }

        fileInputStream.close();

        int maxByte = 0;
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : integerHashMap.entrySet()) {

            if (entry.getValue() > maxCount) {
                maxByte = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.print(maxByte);


        for (Map.Entry<Integer, Integer> entry : integerHashMap.entrySet()) {
            if (Objects.equals(entry.getValue(), integerHashMap.get(maxByte))) {
                if (!entry.getKey().equals(maxByte)) {
                    System.out.print(" " + entry.getKey());
                }
            }
        }
    }
}
