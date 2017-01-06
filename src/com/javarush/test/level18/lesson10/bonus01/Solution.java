package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {

    public static void main(String[] args) throws IOException {
        if (args.length > 0) {

            String key = "ggg";
            FileInputStream fileInputStream = new FileInputStream(args[1]);
            FileOutputStream fileOutputStream = new FileOutputStream(args[2]);

            byte[] data = new byte[fileInputStream.available()];
            int count = fileInputStream.read(data);

            byte[] outputData = new byte[data.length];
            if ("-e".equals(args[0])) {
                outputData = encode(data, key);
            } else if ("-d".equals(args[0])) {
                outputData = decode(data, key);
            }
            fileOutputStream.write(outputData, 0, count);

            fileInputStream.close();
            fileOutputStream.close();
        }
    }

    public static byte[] encode(byte[] pText, String pKey) {
        byte[] key = pKey.getBytes();
        byte[] res = new byte[pText.length];

        for (int i = 0; i < pText.length; i++) {
            res[i] = (byte) (pText[i] ^ key[i % key.length]);
        }

        return res;
    }

    public static byte[] decode(byte[] pText, String pKey) {
        byte[] res = new byte[pText.length];
        byte[] key = pKey.getBytes();

        for (int i = 0; i < pText.length; i++) {
            res[i] = (byte) (pText[i] ^ key[i % key.length]);
        }

        return res;
    }
}
