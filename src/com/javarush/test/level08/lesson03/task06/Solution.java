package com.javarush.test.level08.lesson03.task06;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* Коллекция HashMap из Object
Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
Sim - 5
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        int i = 100_000_000;
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double)123);

        String value;

        for (Map.Entry<String, Object> ss: map.entrySet() ) {
            if (ss.getValue() == null) {
                value = "null";
            } else {
                value = ss.getValue().toString();
            }
            System.out.println(ss.getKey() + " - " + value);
        }



        Date currentTime = new Date(10, 10, 10);           //получаем текущую дату и время
        Date newTime = new Date();               //получаем новое текущее время

        System.out.println(currentTime.getTime());

        System.out.println(i);


    }
}
