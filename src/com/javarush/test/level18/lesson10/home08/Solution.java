package com.javarush.test.level18.lesson10.home08;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {

    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String fileName;
        while (!"exit".equals(fileName = scanner.nextLine())) {
            ReadThread readThread = new ReadThread(fileName);
            readThread.start();
        }
        scanner.close();
    }

    public static class ReadThread extends Thread {

        private String fileName;

        public ReadThread(String fileName) throws IOException {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            HashMap<Byte, Integer> map = new HashMap<>();
            byte[] data = new byte[0];
            int max = Integer.MIN_VALUE;
            byte res = Byte.MIN_VALUE;

            try {

                FileInputStream inputStream = new FileInputStream(fileName);
                while (inputStream.available() > 0) {
                    data = new byte[inputStream.available()];
                    inputStream.read(data);
                }
                inputStream.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < data.length; i++) {
                if (map.containsKey(data[i])) {
                    Integer value = map.get(data[i]);
                    map.put(data[i], value + 1);
                } else {
                    map.put(data[i], 1);
                }
            }

            for (Map.Entry<Byte, Integer> entry : map.entrySet()) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    res = entry.getKey();
                }
            }
            resultMap.put(fileName, (int) res);
        }
    }
}
