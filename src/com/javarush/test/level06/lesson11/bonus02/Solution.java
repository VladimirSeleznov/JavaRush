package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: маму, папу, сына, дочь, бабушку(мамина мама) и дедушку(папин папа).
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);

        String grandfatherName = scanner.nextLine();
        Cat catGrandfather = new Cat(grandfatherName);

        String grandmotherName = scanner.next();
        Cat catGrandmother = new Cat(grandmotherName);

        String fatherName = scanner.nextLine();
        Cat catFather = new Cat(fatherName, catGrandfather, null);

        String motherName = scanner.nextLine();
        Cat catMother = new Cat(motherName, null, catGrandmother);

        String sonName = scanner.nextLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        String daughterName = scanner.nextLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        System.out.println(catGrandfather);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat parentF;
        private Cat parentM;

        Cat(String name)
        {
            this.name = name;
        }

        public Cat(String name, Cat parentM, Cat parentF)
        {
            this.name = name;
            this.parentM = parentM;
            this.parentF = parentF;
        }

        @Override
        public String toString()
        {
            if (parentF == null && parentM == null)
            {
                return "Cat name is " + name + ", no mother, no father ";
            }
            else
            if (parentM == null)
                return "Cat name is " + name + ", mother is "  + parentF.name + ", no father ";
            if (parentF == null)
                return "Cat name is " + name + ", no mother, father is "  + parentM.name;
            else
                return "Cat name is " + name + ", mother is " + parentF.name + ", father is "  + parentM.name;
        }
    }
}
