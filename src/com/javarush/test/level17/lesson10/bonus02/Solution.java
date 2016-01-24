package com.javarush.test.level17.lesson10.bonus02;

import com.javarush.test.level17.lesson10.bonus01.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD 2
CrUD Batch - multiple Creation, Updates, Deletion
!!!РЕКОМЕНДУЕТСЯ выполнить level17.lesson10.bonus01 перед этой задачей!!!

Программа запускается с одним из следующих наборов параметров:
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с  - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
-u  - обновляет соответствующие данные людей с заданными id
-d  - производит логическое удаление всех людей с заданными id
-i  - выводит на экран информацию о всех людях с заданными id: name sex bd

id соответствует индексу в списке
Формат вывода даты рождения 15-Apr-1990
Все люди должны храниться в allPeople
Порядок вывода данных соответствует вводу данных
Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных)
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception {

        SimpleDateFormat inDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat outDate = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        Person person;

        switch (args[0]) {
            case "-c":
                for (int i = 0; i < args.length - 3; i += 3) {
                    switch (args[i + 2]) {
                        case "м":
                            person = Person.createMale(args[i + 1], inDate.parse(args[i + 3]));
                            break;
                        case "ж":
                            person = Person.createFemale(args[i + 1], inDate.parse(args[i + 3]));
                            break;
                        default:
                            throw new Exception("sex param is incorrect");
                    }
                    allPeople.add(person);
                    System.out.println(allPeople.indexOf(person));
                }
                break;

            case "-u":
                for (int i = 0; i < args.length - 4; i += 4) {
                    int index = Integer.parseInt(args[i + 1]);
                    person = allPeople.get(index);
                    person.setName(args[i + 2]);
                    person.setBirthDay(inDate.parse(args[i + 4]));
                    switch (args[i + 3]) {
                        case "м":
                            person.setSex(Sex.MALE);
                            break;
                        case "ж":
                            person.setSex(Sex.FEMALE);
                            break;
                        default:
                            throw new Exception("sex param is incorrect");
                    }
                }
                break;

            case "-d":
                for (int i = 0; i < args.length - 1; i++) {
                    int index = Integer.parseInt(args[i + 1]);
                    person = allPeople.get(index);
                    person.setBirthDay(null);
                }
                break;

            case "-i":
                for (int i = 0; i < args.length - 1; i++) {
                    int index = Integer.parseInt(args[i + 1]);
                    person = allPeople.get(index);
                    System.out.println(person.getName()
                            + " "
                            + (person.getSex().equals(Sex.MALE) ? "м" : "ж")
                            + " "
                            + outDate.format(person.getBirthDay()));
                }
                break;

            default:
                throw new Exception("parameter is incorrect");
        }
    }
}