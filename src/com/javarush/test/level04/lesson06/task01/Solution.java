package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sDigitOne = reader.readLine();
        String sDigitTwo = reader.readLine();

        int iDigitOne = Integer.parseInt(sDigitOne);
        int iDigitTwo = Integer.parseInt(sDigitTwo);

        if (iDigitTwo < iDigitOne) {
            System.out.println(iDigitTwo);
        } else  {
            System.out.println(iDigitOne);
        }
    }
}