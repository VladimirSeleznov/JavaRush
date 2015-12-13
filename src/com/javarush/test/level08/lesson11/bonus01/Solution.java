package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер
на экран в виде: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //создадим метод чтения с клавиатуры
        String s = readText();

        //создадим map со списком месяцев
        Map<String,Integer> map = mapCreate();

        //ищем пару ключ - значение и печатаем там же
        searchMonth(s, map);
    }

    private static void searchMonth(String s, Map<String,Integer> map)
    {
        for (Map.Entry<String,Integer> pair : map.entrySet()){
            if (pair.getKey().contains(s)){
                System.out.println(pair.getKey()+ " is " + pair.getValue() + " month");
            }
        }
    }

    private static Map<String, Integer> mapCreate()
    {
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("January",1);
        map.put("February",2);
        map.put("March",3);
        map.put("April",4);
        map.put("May",5);
        map.put("June",6);
        map.put("July",7);
        map.put("August",8);
        map.put("September",9);
        map.put("October",10);
        map.put("November",11);
        map.put("December",12);

        return map;
    }

    private static String readText() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

}