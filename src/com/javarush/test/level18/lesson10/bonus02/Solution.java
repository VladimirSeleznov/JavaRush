package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        if (args.length > 0) {

            Scanner scanner = new Scanner(System.in);
            String fileName = scanner.next();
            scanner.close();

            FileInputStream in = new FileInputStream(fileName);
            InputStreamReader inputStreamReader = new InputStreamReader(in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            List<String> lines = new ArrayList<>();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }

            if ("-c".equals(args[0])) {
                String productName = "";
                for (int i = 1; i < args.length - 2; i++) {
                    productName = productName + args[i] + " ";
                }

                productName = Solution.align(productName, 30);
                String price = Solution.align(args[args.length - 2], 8);
                String quantity = Solution.align(args[args.length - 1], 4);

                String lastTableRow = lines.get(lines.size() - 1);
                Integer lastId = Integer.valueOf(lastTableRow.substring(0, 8).trim());
                Integer id = lastId + 1;
                String strId = Solution.align(id.toString(), 8);

                FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bw = new BufferedWriter(outputStreamWriter);

                String toWrite = strId + productName + price + quantity;
                bw.newLine();
                bw.write(toWrite);

                bw.close();
                fileOutputStream.close();
                outputStreamWriter.close();
            }

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
