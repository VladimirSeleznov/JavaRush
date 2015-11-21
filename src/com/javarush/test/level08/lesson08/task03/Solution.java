package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution {

    public static HashMap<String, String> createMap() {
        HashMap<String, String> list = new HashMap<>();
        list.put("Vasya", "Vashechkin");
        list.put("Vgahsya", "Vashechkin");
        list.put("Vagkhsya", "Vashechkin");
        list.put("Vagsya", "Vashechkin");
        list.put("Vkkghasya", "Vashechkin");
        list.put("Vahgksya", "Vashechkin");
        list.put("Vahmsya", "Vashechkin");
        list.put("Vmhgasya", "Vashechkin");
        list.put("Vaiytsya", "Vashechkin");
        list.put("Vashfdhdya", "Vashechkin");
        return list;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {


        int numb = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getValue();

            if (key.equals(name)) {
                numb++;
            }

        }


        return numb;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya) {

        int numb = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();

            if (key.equals(familiya)) {
                numb++;
            }

        }
        return numb;
    }
}
