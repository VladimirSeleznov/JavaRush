package com.javarush.test.level09.lesson11.home08;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> list = new ArrayList<int[]>();
        int[] list1 = {1,2,3,4,5};
        int[] list2 = {1,2};
        int[] list3= {1,2,3,4};
        int[] list4 = {1,2,3,4,5, 6,7};
        int[] list5 = new int[0];
        Collections.addAll(list,list1, list2, list3, list4, list5);
        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
