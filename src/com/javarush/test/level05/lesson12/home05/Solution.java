package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String sDigitOne = "";
        int sum = 0;
        int iDiditOne = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (; !sDigitOne.equals("сумма"); ) {
            sDigitOne = reader.readLine();
            try {
                iDiditOne = Integer.parseInt(sDigitOne);
                sum = iDiditOne + sum;
            } catch (NumberFormatException e) {
                //
            }

        }
        System.out.println(sum);
    }
}
