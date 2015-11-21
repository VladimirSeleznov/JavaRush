package com.javarush.test.level07.lesson04.task04;

import java.util.*;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Integer[] numb = new Integer[10];
        Integer[] numbReverse = new Integer[10];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            numb[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            numbReverse[9-i] = numb[i];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(numbReverse[i]);
        }
    }
}
