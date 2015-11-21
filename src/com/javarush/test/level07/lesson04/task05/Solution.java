package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Integer[] numb = new Integer[20];
        Integer[] numb1 = new Integer[10];
        Integer[] numb2 = new Integer[10];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < numb.length; i++) {
            numb[i] = scanner.nextInt();
        }

        for (int i = 0; i < numb.length; i++) {

            if(i < 10){
                numb1[i] = numb[i];
            }else{
                numb2[i-10] = numb[i];
            }

        }

        for (Integer aNumb2 : numb2) {
            System.out.println(aNumb2);
        }

    }
}
