package com.javarush.test.level07.lesson12.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Вводить с клавиатуры строки, пока пользователь не введёт строку 'end'
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {



        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String s = scanner.next();

        while(!("end".equals(s))) {
            list.add(s);
            s = scanner.next();
        }

        for (String s1 : list) {
            System.out.println(s1);
        }

    }

}
