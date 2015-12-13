package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{

    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> map = new HashMap<String, String>();

        map.put("Сергеев", "Антон");
        map.put("Иванов", "Петя");
        map.put("Стаханов", "Жора");
        map.put("Сталин", "Иосиф");
        map.put("Куриев", "Артур");
        map.put("Сколов", "Антон");
        map.put("Воробев", "Станичлав");
        map.put("Сергеева", "Антон");
        map.put("Глодин", "Паша");
        map.put("Кинг", "Стивен");
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        Iterator<Map.Entry<String, String>> iterator1 = map.entrySet().iterator();
        Iterator<Map.Entry<String, String>> iterator2 = map.entrySet().iterator();
        ArrayList<String> list = new ArrayList<String>();
        for (Map.Entry<String, String> pair1 : map.entrySet())
        {
            for (Map.Entry<String, String> pair2 : map.entrySet())
            {
                if (pair1.getValue().equals(pair2.getValue()) && !(pair1.getKey().equals(pair2.getKey())))
                    list.add(pair1.getValue());
            }
        }
        for (String text : list)
        {
            removeItemFromMapByValue(map, text);
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
