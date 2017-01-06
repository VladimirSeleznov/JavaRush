package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {

    public static void main(String[] args) throws IOException {
        if (args.length > 0) {

            FileInputStream inputStream = new FileInputStream(args[0]);
            byte[] data;
            data = new byte[inputStream.available()];
            inputStream.read(data);

            TreeMap<Byte, Integer> map = new TreeMap<>();
            for (int i = 0; i < data.length; i++) {
                if (map.containsKey(data[i])) {
                    Integer value = map.get(data[i]);
                    Integer newValue = value++;
                    map.put(data[i], value);
                } else {
                    map.put(data[i], 1);
                }
            }

            for (Map.Entry<Byte, Integer> entry : map.entrySet()) {
                char ch = (char) entry.getKey().byteValue();
                System.out.println(ch + " " + entry.getValue());
            }
            inputStream.close();
        }
    }
}
