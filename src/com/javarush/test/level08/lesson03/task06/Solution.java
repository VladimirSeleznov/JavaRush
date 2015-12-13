package com.javarush.test.level08.lesson03.task06;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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
        Date currentTime = new Date();           //получаем текущую дату и время


        long msDelay = currentTime.getTime(); //вычисляем разницу
        System.out.println("Time distance is: " + msDelay + " in ms");
    }



}