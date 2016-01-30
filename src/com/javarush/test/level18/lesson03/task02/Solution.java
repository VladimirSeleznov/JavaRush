package com.javarush.test.level18.lesson03.task02;

import java.io.FileInputStream;
import java.util.Scanner;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        scanner.close();

        FileInputStream fileInputStream = new FileInputStream(fileName);

        int fileByte = fileInputStream.read();

        while (fileInputStream.available() > 0) {
            int currentByte = fileInputStream.read();
            if (fileByte > currentByte) {
                fileByte = currentByte;
            }
        }

        fileInputStream.close();
        System.out.println(fileByte);
    }
}
