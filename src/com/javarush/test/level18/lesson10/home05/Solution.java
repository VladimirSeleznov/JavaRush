package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
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

        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName2);

        byte[] data;
        data = new byte[fileInputStream.available()];
        fileInputStream.read(data);

        String content = new String(data);
        String[] contents = content.split(" ");
        long[] numbers = new long[contents.length];
        for (int i = 0; i < contents.length; i++) {
            numbers[i] = Math.round(Double.parseDouble(contents[i]));
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (Long number : numbers) {
            stringBuilder.append(number.toString());
            stringBuilder.append(" ");
        }
        byte[] output = stringBuilder.toString().trim().getBytes();

        fileOutputStream.write(output);

        fileInputStream.close();
        fileOutputStream.close();
    }
}
