package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int iDiditOne = 0;
        int sum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (;iDiditOne != -1;) {
            String sDigitOne = reader.readLine();
            iDiditOne = Integer.parseInt(sDigitOne);
            sum = iDiditOne + sum;
            }
        System.out.println(sum);
    }
}
