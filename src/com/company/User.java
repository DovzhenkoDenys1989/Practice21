package com.company;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class User {
    //    4. Работа с своим классом
//    a. Создать класс User с полями name, old и phone
    private String name;
    private Integer old;
    private String phone;

    public User(String name, Integer old, String phone) {
        this.name = name;
        this.old = old;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", old=" + old +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static void main(String[] args) {
//     b. Создать userSet (HashSet<User> )
        Set<User> userSet = new HashSet<>();

//     c. Создать 2 экземпляра класса User с одинаковыми полями и 1 экземпляр
//     отличающийся возрастом
        User user1 = new User("Bob", 28, "050-555-55-55");
        User user2 = new User("Bob", 28, "050-555-55-55");
        User user3 = new User("Bob", 32, "050-555-55-55");

//     d. Добавить пользователей в userSet .
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);

//     e. Вывести пользователей на экран
        System.out.println(userSet);
    }

//     f. Переопределить в классе User метод hashcode, Указав в нем только
//     обработку поля name.
//     g. Вывести пользователей на экран
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return name.equals(user.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }

    //     h. Переопределить в классе User метод hashcode, Указав в нем все поля класса.
//     i. Вывести пользователей на экран
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name.equals(user.name) && old.equals(user.old) && phone.equals(user.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, old, phone);
    }
}
