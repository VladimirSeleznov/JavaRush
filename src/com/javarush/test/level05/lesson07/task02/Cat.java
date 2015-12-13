package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    int age;
    int weight;
    String name;
    String color;
    String address;

    public void initialize (int age, String name)
    {
        this.name = name;
        this.age = age;
        this.weight = 1;
    }
    public void initialize (String name, int age, int weight)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public void initialize (String name)
    {
        this.name = name;
    }
    public void initialize (String color, int weight)
    {
        this.color = color;
        this.weight = weight;
    }
    public void initialize (String color, int weight, String address)
    {
        this.color = color;
        this.weight = weight;
        this.address = address;
    }

}
