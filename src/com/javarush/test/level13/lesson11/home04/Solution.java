package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();
        ArrayList<String> strings = new ArrayList<String>();
        while (true)
        {
            String string = scanner.nextLine();
            strings.add(string);
            if (string.equals("exit"))
            {
                scanner.close();
                break;
            }
        }
        PrintWriter writer = new PrintWriter(file);
        for (String s : strings)
        {
            writer.println(s);
        }
        writer.close();
    }
}
