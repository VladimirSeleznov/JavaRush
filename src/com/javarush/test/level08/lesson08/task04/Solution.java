package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("St", new Date("JUNE 3 1980"));
        map.put("Sta", new Date("JUNE 11 1981"));
        map.put("Stal", new Date("JUNE 4 1982"));
        map.put("Stall", new Date("JUNE 7 1983"));
        map.put("Stallo", new Date("JUNE 12 1984"));
        map.put("Stallon", new Date("JUNE 27 1985"));
        map.put("Stallonee", new Date("JUNE 3 1986"));
        map.put("Stalloneee", new Date("JUNE 17 1987"));
        map.put("Stalloneeee", new Date("JUNE 18 1988"));

        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        HashMap<String, Date> map2 = new HashMap<String, Date>(map);
        Iterator<Map.Entry<String, Date>> iterator = map2.entrySet().iterator();
        while (iterator.hasNext()) {
             Map.Entry<String, Date> pair = iterator.next();
            int value = pair.getValue().getMonth();
            if(value == 5 || value ==6 || value ==7){
                map.remove(pair.getKey());
            }

        }
    }

}
