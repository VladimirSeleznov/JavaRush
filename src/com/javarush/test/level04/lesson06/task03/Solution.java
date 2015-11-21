package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sDigitOne = reader.readLine();
        String sDigitTwo = reader.readLine();
        String sDigitThree = reader.readLine();

        int iDigitOne = Integer.parseInt(sDigitOne);
        int iDigitTwo = Integer.parseInt(sDigitTwo);
        int iDigitThree = Integer.parseInt(sDigitThree);

        Integer[] ch = new Integer[3];
        ch[0] = iDigitOne;
        ch[1] = iDigitTwo;
        ch[2] = iDigitThree;

        Arrays.sort(ch);

        System.out.println(ch[1]);

    }
}
