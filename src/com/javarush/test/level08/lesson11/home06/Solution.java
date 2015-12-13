package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human petka = new Human("Петька", true, 16);
        Human katya = new Human("Катя", false, 15);
        Human aristarh = new Human("Аристарх", true, 12);
        Human papka = new Human("Папка", true, 41, petka, katya, aristarh);
        Human mat = new Human("Мать", false, 37, petka, katya, aristarh);
        Human ded = new Human("Дед", true, 76, papka);
        Human babka = new Human("Бабка", false, 73, papka);
        Human huyed = new Human("Хуед", true, 76, mat);
        Human huyabka = new Human("Хуябка", false, 73, mat);
        System.out.println(ded.toString());
        System.out.println(babka.toString());
        System.out.println(huyed.toString());
        System.out.println(huyabka.toString());
        System.out.println(papka.toString());
        System.out.println(mat.toString());
        System.out.println(petka.toString());
        System.out.println(katya.toString());
        System.out.println(aristarh.toString());
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human human)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(human);
        }
        public Human(String name, boolean sex, int age, Human human1, Human human2, Human human3)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(human1);
            this.children.add(human2);
            this.children.add(human3);
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
