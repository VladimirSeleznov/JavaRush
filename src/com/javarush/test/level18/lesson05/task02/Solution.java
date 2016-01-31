package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        scanner.close();

        FileInputStream inputStream = new FileInputStream(fileName);

        if (inputStream.available() > 0)
        {
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            inputStream.close();
            int count = 0;
            for (int i = 0; i < buffer.length; i++) {
                if (buffer[i] == 44) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
