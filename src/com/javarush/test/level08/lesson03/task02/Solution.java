package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт, дыня - овощ, ежевика - куст, жень-шень - корень, земляника - ягода, ирис - цветок, картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель - клубень
*/

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("арбуз", "ягода");
        stringMap.put("банан", "трава");
        stringMap.put("вишня", "ягода");
        stringMap.put("груша", "фрукт");
        stringMap.put("дыня", "овощ");
        stringMap.put("ежевика", "куст");
        stringMap.put("жень-шень", "корень");
        stringMap.put("земляника", "ягода");
        stringMap.put("ирис", "цветок");
        stringMap.put("картофель", "клубень");

        for (Map.Entry<String, String> ss: stringMap.entrySet()) {
            System.out.println(ss.getKey() + " - " + ss.getValue());
        }


    }
}
