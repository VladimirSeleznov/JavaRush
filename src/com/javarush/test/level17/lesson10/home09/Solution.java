package com.javarush.test.level17.lesson10.home09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Транзакционность
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines
4. Если список allLines НЕ содержит каких-либо строк, которые есть в forRemoveLines, то
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
*/

public class Solution
{
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();


    public static void main(String[] args) throws FileNotFoundException, CorruptedDataException
    {
        Scanner fileNameScanner = new Scanner(System.in);
        String fileNameAllLines = fileNameScanner.nextLine();
        String fileNameForRemoveLines = fileNameScanner.nextLine();

        fileNameScanner.close();


        Scanner fileAllLines = new Scanner(new File(fileNameAllLines));
        Scanner fileForRemoveLines = new Scanner(new File(fileNameForRemoveLines));

        while (fileAllLines.hasNext())
        {
            allLines.add(fileAllLines.nextLine());
        }
        fileAllLines.close();

        while (fileForRemoveLines.hasNext())
        {
            forRemoveLines.add(fileForRemoveLines.nextLine());
        }
        fileForRemoveLines.close();

        Solution solution = new Solution();
        solution.joinData();

        for (String s : allLines)
        {
            System.out.println(s);
        }

    }

    public void joinData() throws CorruptedDataException
    {
        if (allLines.containsAll(forRemoveLines))
        {
            allLines.removeAll(forRemoveLines);
        } else
        {

            for (String s : forRemoveLines)
            {
                if (!allLines.contains(s))
                {
                    allLines.clear();
                    throw new CorruptedDataException();
                }
            }
        }
    }
}
