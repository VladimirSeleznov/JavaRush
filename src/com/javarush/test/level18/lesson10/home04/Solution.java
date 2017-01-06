package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName1 = scanner.nextLine();
        String fileName2 = scanner.nextLine();
        scanner.close();

        FileInputStream inputStream2 = new FileInputStream(fileName2);
        byte[] buffer2 = new byte[inputStream2.available()];
        int count2 = inputStream2.read(buffer2);

        FileInputStream inputStream1 = new FileInputStream(fileName1);
        byte[] buffer1 = new byte[inputStream1.available()];
        int count1 = inputStream1.read(buffer1);

        FileOutputStream outputStream = new FileOutputStream(fileName1);
        FileOutputStream outputStream1 = new FileOutputStream(fileName1, true);
        outputStream1.write(buffer2, 0, count2);
        outputStream1.write(buffer1, 0, count1);

        outputStream1.close();
        outputStream.close();
        inputStream1.close();
        inputStream2.close();
    }
}
