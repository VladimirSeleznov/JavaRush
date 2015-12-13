package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sDigit1 = reader.readLine();
        int nDigit1 = Integer.parseInt(sDigit1);
        String sDigit2 = reader.readLine();
        int nDigit2 = Integer.parseInt(sDigit2);
        String sDigit3 = reader.readLine();
        int nDigit3 = Integer.parseInt(sDigit3);

        if (nDigit1 < nDigit2 && nDigit1 < nDigit3)
        {
            if (nDigit2 < nDigit3)
                System.out.println(nDigit2);
            else
                System.out.println(nDigit3);
        }
        if (nDigit3 < nDigit2 && nDigit3 < nDigit1)
        {
            if (nDigit2 < nDigit1)
                System.out.println(nDigit2);
            else
                System.out.println(nDigit1);
        }
        if (nDigit2 < nDigit3 && nDigit2 < nDigit1)
        {
            if (nDigit3 < nDigit1)
                System.out.println(nDigit3);
            else
                System.out.println(nDigit1);
        }
    }
}
