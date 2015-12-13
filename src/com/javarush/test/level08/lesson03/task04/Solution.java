package com.javarush.test.level08.lesson03.task04;

import java.util.HashMap;
import java.util.Map;

/* Вывести на экран список ключей
Есть коллекция HashMap<String, String>, туда занесли 10 различных строк. Вывести на экран список ключей, каждый элемент с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap<String, String> huyap = new HashMap<String, String>();
        huyap.put("Sim", "Sim");
        huyap.put("Tom", "Tom");
        huyap.put("Arbus", "Arbus");
        huyap.put("Baby", "Baby");
        huyap.put("Cat", "Cat");
        huyap.put("Dog", "Dog");
        huyap.put("Eat", "Eat");
        huyap.put("Food", "Food");
        huyap.put("Gevey", "Gevey");
        huyap.put("Hugs", "Hugs");

        printKeys(huyap);
    }

    public static void printKeys(Map<String, String> huyap)
    {
        for (Map.Entry<String, String> pair : huyap.entrySet())
        {
            String key = pair.getKey();                      //ключ
            System.out.println(key);
        }
    }
}
