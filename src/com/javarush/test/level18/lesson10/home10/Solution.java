package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName;
        List<String> files = new ArrayList<>();
        while (!"end".equals(fileName = scanner.nextLine())) {
            files.add(fileName);
        }
        scanner.close();

        String firstFileName = files.get(0);
        int startIndex = firstFileName.lastIndexOf(".");
        String toBeReplaced = firstFileName.substring(startIndex, firstFileName.length());
        String resultName = firstFileName.replace(toBeReplaced, "");
        FileOutputStream fileOutputStream = new FileOutputStream(resultName, true);

        Collections.sort(files);

        for (String file : files) {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] data = new byte[fileInputStream.available()];
            int count = fileInputStream.read(data);
            fileOutputStream.write(data, 0, count);
            fileInputStream.close();
        }
        fileOutputStream.close();
    }
}

