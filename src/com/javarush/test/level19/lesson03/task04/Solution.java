package com.javarush.test.level19.lesson03.task04;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные одного человека.
*/

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        PersonScannerAdapter personScannerAdapter = new PersonScannerAdapter(new Scanner(new File("/Users/Vladimir/Documents/JavaRushHomeWork/src/com/javarush/test/level19/lesson03/task04/file.txt")));

        Person read = personScannerAdapter.read();
    }

    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner scanner;

        public PersonScannerAdapter(Scanner scanner) {
            this.scanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            String line = scanner.nextLine();
            String[] split = line.split(" ");

            Calendar calendar = new GregorianCalendar(Integer.parseInt(split[5]), Integer.parseInt(split[4]) - 1, Integer.parseInt(split[3]));
            Date date = calendar.getTime();
            return new Person(split[1], split[2], split[0], date);
        }

        @Override
        public void close() throws IOException {
            scanner.close();
        }
    }
}
