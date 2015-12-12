package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;
import java.util.List;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("public static void printList(ArrayList<String>[] arrayOfStringList)");
        list.add("public static void printList(ArrayList<String>[] arrayOfStringList)");
        list.add("public static void printList(ArrayList<String>[] arrayOfStringList)");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("for (ArrayList<String> list: arrayOfStringList)");
        list1.add("for (ArrayList<String> list: arrayOfStringList)");
        list1.add("for (ArrayList<String> list: arrayOfStringList)");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("ArrayList<String>[] arrayOfStringList =  createList();");
        list2.add("ArrayList<String>[] arrayOfStringList =  createList();");
        list2.add("ArrayList<String>[] arrayOfStringList =  createList();");

        ArrayList<String>[] arrayLists = new ArrayList[3];
        arrayLists[0] = list;
        arrayLists[1] = list1;
        arrayLists[2] = list2;

        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}