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
        HashMap<String, String> map = new HashMap<>();
        map.put("Vasya", "Vashechkin");
        map.put("Vgahsya", "Vashechkin");
        map.put("Vagkhsya", "Vashechkin");
        map.put("Vagsya", "Vashechkin1");
        map.put("Vkkghasya", "Vashechkin");
        map.put("Vahgksya", "Vashechkin");
        map.put("Vahmsya", "Vashechkin");
        map.put("Vmhgasya", "Vashechkin");
        map.put("Vaiytsya", "Vashechkin");
        map.put("Vashfdhdya", "Vashechkin");
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, String> pair: map.entrySet()) {
            for (Map.Entry<String, String> pair2 : map.entrySet()) {
                if (pair.getValue().equals(pair2.getValue()) && !(pair.getKey().equals(pair2.getKey()))) {
                    list.add(pair2.getValue());
                }
            }
        }
        for (String s: list){
            removeItemFromMapByValue(map, s);
            System.out.println(s);
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
