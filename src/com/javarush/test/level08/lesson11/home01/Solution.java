package com.javarush.test.level08.lesson11.home01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();

        Iterator<Cat> iterator = cats.iterator();

        while (iterator.hasNext())
        {
            if(iterator.next().name.equals("vasya")){
                iterator.remove();
            }
        }

        printCats(cats);
    }

    public static class Cat
    {
        String name;
        int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static Set<Cat> createCats()
    {
        Cat cat1 = new Cat("vasya",11);
        Cat cat2 = new Cat("vetalya",7);
        Cat cat3 = new Cat("barsik",14);
        Set<Cat> list = new HashSet<>();
        list.add(cat1);
        list.add(cat2);
        list.add(cat3);
        return list;
    }

    public static void printCats(Set<Cat> cats)
    {
        for (Cat cat : cats) {
            System.out.println(cat);
        }

    }

}
