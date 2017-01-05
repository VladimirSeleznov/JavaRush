package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Solution {

    public static void main(String[] args) throws IOException {
        int countSymbols = 0;
        int countSpaces = 0;

        if (args.length > 0) {
            FileInputStream inputStream = new FileInputStream(args[0]);
            while (inputStream.available() > 0) {
                int bt = inputStream.read();
                if (bt == 32) {
                    countSpaces++;
                }
                countSymbols++;
            }
            inputStream.close();
            double r = (double) countSpaces / (double) countSymbols * 100;
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            decimalFormat.setRoundingMode(RoundingMode.CEILING);
            System.out.println(decimalFormat.format(r));
        }
    }
}