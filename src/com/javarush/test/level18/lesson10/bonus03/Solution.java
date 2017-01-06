package com.javarush.test.level18.lesson10.bonus03;

/* Прайсы 2
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-u  - обновляет данные товара с заданным id
-d  - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {

        if (args.length > 0) {

            Scanner scanner = new Scanner(System.in);
            String fileName = scanner.next();
            scanner.close();

            FileInputStream in = new FileInputStream(fileName);
            InputStreamReader inputStreamReader = new InputStreamReader(in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            List<String> lines = new ArrayList<>();
            List<String> newLines = new ArrayList<>();

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }

            if ("-u".equals(args[0])) {
                String newProductName = "";
                for (int i = 2; i < args.length - 2; i++) {
                    newProductName = newProductName + args[i] + " ";
                }

                String newId = align(args[1], 8);
                newProductName = Solution.align(newProductName, 30);
                String newPrice = align(args[args.length - 2], 8);
                String newQuantity = align(args[args.length - 1], 4);

                for (String item : lines) {
                    String actualId = item.substring(0, 8);

                    if (actualId.equals(newId)) {
                        newLines.add(actualId + newProductName + newPrice + newQuantity);
                    } else {
                        newLines.add(item);
                    }
                }
            }

            if ("-d".equals(args[0])) {
                String newId = align(args[1], 8);
                for (String item : lines) {
                    String actualId = item.substring(0, 8);
                    if (!newId.equals(actualId)) {
                        newLines.add(item);
                    }
                }
            }

            PrintWriter printWriter = new PrintWriter(fileName);
            for (String newItem : newLines) {
                printWriter.println(newItem);
            }
            printWriter.close();
            in.close();
            inputStreamReader.close();
            bufferedReader.close();
        }
    }

    private static String align(String s, int count) {
        if (s.length() > count) {
            s = s.substring(0, Math.min(s.length(), count));
        } else {
            s = String.format("%1$-" + count + "s", s);
        }

        return s;
    }
}
