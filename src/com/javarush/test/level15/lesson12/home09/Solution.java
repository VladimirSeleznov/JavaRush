package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String query = string.split("\\?")[1];
        String[] pairs = query.split("&");
        Map<String, String> query_pairs = new LinkedHashMap<String, String>();
        for (String parameter_value : pairs)
        {
            if (parameter_value.contains("="))
            {
                int index = parameter_value.indexOf("=");
                String parameter = parameter_value.substring(0, index);
                String value = parameter_value.substring(index + 1);
                query_pairs.put(parameter, value);
                System.out.print(parameter + " ");
            } else {
                query_pairs.put(parameter_value, null);
                System.out.print(parameter_value + " ");
            }
        }

        System.out.println();
        if (query_pairs.containsKey("obj"))
        {
            String objValue = query_pairs.get("obj");
            try
            {
                alert(Double.parseDouble(objValue));
            }
            catch (Exception e)
            {
                alert(objValue);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
