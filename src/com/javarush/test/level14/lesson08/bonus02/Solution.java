package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        int min = first < second ? first : second;

        for (int i = min; i > 0; i--)
        {
            if (first % i == 0 && second % i == 0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
