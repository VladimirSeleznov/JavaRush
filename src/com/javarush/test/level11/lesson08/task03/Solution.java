package com.javarush.test.level11.lesson08.task03;

/* Ничего не поменяешь
Скрыть все внутренние переменные класса Cat, а также методы, позволяющие менять внутреннее состояние объектов класса Cat.
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public class Cat
    {
        public String name;
        public int age;
        public int weight;

        public Cat(String name, int age, int weight)
        {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public int getAge()
        {
            return age;
        }

        public void setAge(int age)
        {
            this.age = age;
        }
    }
}
