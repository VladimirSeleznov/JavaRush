package com.javarush.test.level17.lesson10.bonus01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

public class Solution
{
    public static List<Person> allPeople = new ArrayList<Person>();

    static
    {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception
    {
        args = new String[]{
                "-u", "0", "Mironov", "м", "15/04/1990",
        };

        SimpleDateFormat inDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat outDate = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Person person;

        switch (args[0])
        {
            case "-c":
                switch (args[2])
                {
                    case "м":
                        person = Person.createMale(args[1], inDate.parse(args[3]));
                        break;
                    case "ж":
                        person = Person.createFemale(args[1], inDate.parse(args[3]));
                        break;
                    default:
                        throw new Exception("sex param is incorrect");
                }
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));
                break;
            case "-u":
                int index = Integer.parseInt(args[1]);
                person = allPeople.get(index);
                person.setName(args[2]);
                person.setBirthDay(inDate.parse(args[4]));
                switch (args[3])
                {
                    case "м":
                        person.setSex(Sex.MALE);
                        break;
                    case "ж":
                        person.setSex(Sex.FEMALE);
                        break;
                    default:
                        throw new Exception("sex param is incorrect");
                }
                break;
            case "-d":
                index = Integer.parseInt(args[1]);
                person = allPeople.get(index);
                person.setBirthDay(null);
                break;
            case  "-i":
                index = Integer.parseInt(args[1]);
                person = allPeople.get(index);
                System.out.println(person.getName()
                        + " "
                        + (person.getSex().equals(Sex.MALE) ? "м" : "ж")
                        + " "
                        + outDate.format(person.getBirthDay()));
                break;
            default:
                throw new Exception("parameter is incorrect");
        }
    }
}
