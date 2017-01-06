package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
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
        String fileName3 = scanner.nextLine();
        scanner.close();

        FileInputStream inputStream2 = new FileInputStream(fileName2);
        FileInputStream inputStream3 = new FileInputStream(fileName3);

        FileOutputStream outputStream1 = new FileOutputStream(fileName1);

        byte[] buffer = new byte[inputStream2.available()];
        int count = inputStream2.read(buffer);
        outputStream1.write(buffer, 0, count);

        outputStream1 = new FileOutputStream(fileName1, true);
        buffer = new byte[inputStream3.available()];
        count = inputStream3.read(buffer);
        outputStream1.write(buffer, 0, count);
        outputStream1.close();
        inputStream2.close();
        inputStream3.close();
    }
}
