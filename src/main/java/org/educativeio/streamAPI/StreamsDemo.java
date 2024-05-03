package org.educativeio.streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamsDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(23);
        list.add(45);
        list.add(6);

        list.stream().filter(num -> num >10).forEach(System.out::println);

        System.out.println();

        List<Person> l1 = new ArrayList<>();
        l1.add(new Person("Dave", 23));
        l1.add(new Person("Joe", 18));
        l1.add(new Person("Ryan", 54));
        l1.add(new Person("Iyan", 5));
        l1.add(new Person("Ray", 63));

        l1.stream()
                .filter(person -> person.getAge()>18 && person.getName().startsWith("R"))
                .forEach(System.out::println);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}