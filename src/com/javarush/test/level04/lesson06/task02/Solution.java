package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sDigitOne = reader.readLine();
        String sDigitTwo = reader.readLine();
        String sDigitThree = reader.readLine();
        String sDigitFour = reader.readLine();

        int iDigitOne = Integer.parseInt(sDigitOne);
        int iDigitTwo = Integer.parseInt(sDigitTwo);
        int iDigitThree = Integer.parseInt(sDigitThree);
        int iDigitFour = Integer.parseInt(sDigitFour);

        int max = max(iDigitOne, iDigitTwo);
        max = max(max, iDigitThree);
        max = max(max, iDigitFour);

        System.out.println(max);
    }

    public static int max(int a, int b)
    {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
