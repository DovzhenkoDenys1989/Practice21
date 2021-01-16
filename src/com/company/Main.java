package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        1. Базовая работа с List
//        a. Создать ArrayList<String> (list1)
        List<String> list1 = new ArrayList<>();

//        b. Создать массив строк. Добавить в список все элементы массива (одним
//        методом)
        String[] strings_add = {"H", "E", "L", "L", "O"};
        Collections.addAll(list1, strings_add);
        System.out.println(list1);

//        c. Создать новый (list2) ArrayList<String>, принициализировав его
//        предыдущим списком
        List<String> list2 = new ArrayList<>(list1);
        System.out.println(list2);

//        d. Создать список (list3) используя Arrays.asList(…)
        String[] strings_as = {"W", "O", "R", "L", "D"};
        List<String> list3 = new ArrayList<>(Arrays.asList(strings_as));
        System.out.println(list3);

//        e. Вставить list3 в середину list2
        list2.addAll(3, list3);
        System.out.println(list2);

//        f. Отсортировать список по убыванию.
        Collections.sort(list2, Collections.reverseOrder());
        System.out.println(list2);

//        g. *Удалить каждый второй элемент списка используя listiterator
        ListIterator<String> listIterator = list2.listIterator();
//        for (int i = 0; i < list2.size(); i++) {
//            listIterator.next();
//            listIterator.next();
//            listIterator.remove();
//        }
//        System.out.println(list2);
        while (listIterator.hasNext()) {
//          listIterator.next();
            listIterator.next();
            listIterator.remove();
            listIterator.next();
        }
        System.out.println(list2);

//        2. Базовая работа с Set
//        a. Создать HashSet<String> (set1)
        Set<String> set1 = new HashSet<>();

//        b. Вставить в set 2 произвольные строки
        set1.add("Hello");
        set1.add("World");
        System.out.println(set1);

//        c. Вставить в set все элементы из list1 и list2
        set1.addAll(list1);
        set1.addAll(list2);

//        d. Вывести на экран значения set-a
        System.out.println(set1);

//        e. Создать LinkedHashSet<String> (set2)
        Set<String> set2 = new LinkedHashSet<>();

//        f. Вставить в set все элементы из list2 и list3
        set2.addAll(list2);
        set2.addAll(list3);

//        g. Вывести на экран значения set-a
        System.out.println(set2);

//        3. Базовая работа с Map
//        a. Создать LinkedHashMap<Integer, String> (map1)
        Map<Integer, String> map1 = new LinkedHashMap<>();

//        b. Добавить в map значения всех месяцев года (номер месяца : название)
//        map1.put(0, "January");
//        map1.put(1, "February");
//        map1.put(2, "March");
//        map1.put(3, "April");
//        map1.put(4, "May");
//        map1.put(5, "June");
//        map1.put(6, "July");
//        map1.put(7, "August");
//        map1.put(8, "September");
//        map1.put(9, "October");
//        map1.put(10, "November");
//        map1.put(11, "December");

        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (int i = 0; i < month.length; i++) {
            map1.put(i, month[i]);
        }

//        c. Вывести на экран первый и последний месяц года (0 и 11)
        System.out.println(map1.get(0));
        System.out.println(map1.get(11));

//        d. Вставить на место 6-го месяца слово ‘ОТПУСК’, вывести на экран
        map1.replace(5, "ОТПУСК");
        System.out.println(map1);

//        e. Создать HashMap<Integer, String> (map2)
        Map<Integer, String> map2 = new HashMap<>();

//        f. Вставить в map2 все значения map1
        map2.putAll(map1);
        System.out.println(map2);

//        g. *Создать метод для вывода всех элементов map в консоль
//        (EntrySet< Integer, String >)
//        Вывести на экран map1, map2
        entrySet(map1);
        System.out.println();
        entrySet(map2);

//        h. *Создать map3 (ключ – имя студента (String), значение -контакты студента:
//        моб.тел, почта, скайп (Set<String>))
        Map<String, Set<String>> map3 = new HashMap<>();
        map3.put("Max", Collections.singleton("mobile: 050-555-55-55"));
        map3.put("John", Collections.singleton("mobile: 097-977-77-77"));
        System.out.println(map3);
    }

    //        g. *Создать метод для вывода всех элементов map в консоль
//        (EntrySet< Integer, String >)
//        Вывести на экран map1, map2
    static void entrySet(Map<Integer, String> map) {
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " " + "Value: " + entry.getValue());
        }
    }
}
/**
 * Описание практики 21. Collections Java:
 * 1. Базовая работа с List
 * a. Создать ArrayList<String> (list1)
 * b. Создать массив строк. Добавить в список все элементы массива (одним
 * методом)
 * c. Создать новый (list2) ArrayList<String>, принициализировав его
 * предыдущим списком
 * d. Создать список (list3) используя Arrays.asList(…)
 * e. Вставить list3 в середину list2
 * f. Отсортировать список по убыванию.
 * g. *Удалить каждый второй элемент списка используя listiterator
 * 2. Базовая работа с Set
 * a. Создать HashSet<String> (set1)
 * b. Вставить в set 2 произвольные строки
 * c. Вставить в set все элементы из list1 и list2
 * d. Вывести на экран значения set-a
 * e. Создать LinkedHashSet<String> (set2)
 * f. Вставить в set все элементы из list2 и list3
 * g. Вывести на экран значения set-a
 * 3. Базовая работа с Map
 * a. Создать LinkedHashMap<Integer, String> (map1)
 * b. Добавить в map значения всех месяцев года (номер месяца : название)
 * c. Вывести на экран первый и последний месяц года (0 и 11)
 * d. Вставить на место 6-го месяца слово ‘ОТПУСК’, вывести на экран
 * e. Создать HashMap<Integer, String> (map2)
 * f. Вставить в map2 все значения map1
 * g. *Создать метод для вывода всех элементов map в консоль
 * (EntrySet< Integer, String >)
 * Вывести на экран map1, map2
 * h. *Создать map3 (ключ – имя студента (String), значение -контакты студента:
 * моб.тел, почта, скайп (Set<String>))
 * 4. Работа с своим классом
 * a. Создать класс User с полями name, old и phone
 * b. Создать userSet (HashSet<User> )
 * c. Создать 2 экземпляра класса User с одинаковыми полями и 1 экземпляр
 * отличающийся возрастом
 * d. Добавить пользователей в userSet .
 * e. Вывести пользователей на экран
 * f. Переопределить в классе User метод hashcode, Указав в нем только
 * обработку поля name.
 * g. Вывести пользователей на экран
 * h. Переопределить в классе User метод hashcode, Указав в нем все поля класса.
 * i. Вывести пользователей на экран
 */


