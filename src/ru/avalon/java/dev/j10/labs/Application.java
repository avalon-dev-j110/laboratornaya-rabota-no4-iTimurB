package ru.avalon.java.dev.j10.labs;

import java.time.LocalDate;
import java.util.Arrays;
import ru.avalon.java.dev.j10.labs.Classes.Persons;
import ru.avalon.java.dev.j10.labs.Classes.SortImpl;
import ru.avalon.java.dev.j10.labs.Classes.newComparator;

public class Application {

    public static void main(String[] args) {
        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив слелдует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */
        String[] strings = {"Диван", "чемодан", "саквояж", "картина", "Корзина", "картонка", "болонка", "космос", "струны", "кванты", "манты",
            "мантры", "песни", "балалайка", "пляски", "танцы", "вечер", "утро", "день", "конец"};


        /*
	     * TODO(Студент): Проинициализируйте массив persons
	     *
	     * 1. Создайте класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализируйте массив persons 20
	     *    экземплярыми созданного класса.
         */
        Persons[] persons = new Persons[20];
        persons[0] = new Persons("Анна", LocalDate.of(1972, 1, 12));
        persons[1] = new Persons("Елена", LocalDate.of(1994, 9, 15));
        persons[2] = new Persons("Василий", LocalDate.of(1932, 1, 23));
        persons[3] = new Persons("Пётр", LocalDate.of(1948, 1, 21));
        persons[4] = new Persons("Джон", LocalDate.of(1981, 1, 11));
        persons[5] = new Persons("Харуна", LocalDate.of(1955, 1, 10));
        persons[6] = new Persons("Бургильда", LocalDate.of(1969, 1, 19));
        persons[7] = new Persons("Татьяна", LocalDate.of(1979, 1, 26));
        persons[8] = new Persons("Сергей", LocalDate.of(2010, 1, 27));
        persons[9] = new Persons("Анастасия", LocalDate.of(2002, 1, 17));
        persons[10] = new Persons("Гюнтер", LocalDate.of(2000, 1, 15));
        persons[11] = new Persons("Жаклин", LocalDate.of(1988, 1, 4));
        persons[12] = new Persons("Зульфия", LocalDate.of(1999, 1, 9));
        persons[13] = new Persons("Фёкла", LocalDate.of(1977, 1, 16));
        persons[14] = new Persons("Анна", LocalDate.of(2005, 1, 22));
        persons[15] = new Persons("Мария", LocalDate.of(2012, 1, 15));
        persons[16] = new Persons("Леонард", LocalDate.of(2001, 1, 17));
        persons[17] = new Persons("Ричард", LocalDate.of(1927, 1, 11));
        persons[18] = new Persons("Едизавета", LocalDate.of(1943, 1, 3));
        persons[19] = new Persons("Михаил", LocalDate.of(1963, 1, 1));


        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
        Sort sort = new SortImpl();

        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */
        newComparator comparator = new newComparator();

        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(persons);
        System.out.println("Sort up: " + Arrays.toString(persons));
        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(strings);
        System.out.println("String + sort по возрастанию: " + Arrays.toString(strings));
        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
        sort.sort(strings, comparator);
        System.out.println("String + sort + comparator по убыванию:" + Arrays.toString(strings));

    }
}
