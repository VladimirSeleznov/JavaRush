package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();
        scanner.close();
        Scanner fileScanner = new Scanner(new FileReader(file));
        while (fileScanner.hasNext())
        {
            System.out.println(fileScanner.next());
        }
    }
}
