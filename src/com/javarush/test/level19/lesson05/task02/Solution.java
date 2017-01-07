package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();
        scanner.close();

        FileReader fileReader = new FileReader(file);

        String txt = "";
        while (fileReader.ready()) {
            char read = (char) fileReader.read();
            txt = txt + read;
        }

        String s = txt.replaceAll("\\p{P}", " ");
        s = s.replaceAll("\\s", " ");

        String[] words = s.split(" ");

        int count = 0;
        for (String word : words) {
            if ("world".equals(word)) {
                count++;
            }
        }

        System.out.println(count);
        fileReader.close();
    }
}
