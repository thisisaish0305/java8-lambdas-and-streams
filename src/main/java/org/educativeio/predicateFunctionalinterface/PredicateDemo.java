package org.educativeio.predicateFunctionalinterface;

import org.educativeio.Person;

import java.util.function.Predicate;

public class PredicateDemo {

    static boolean isEligibleForVoting(Person person, Predicate<Person>predicate){
        return predicate.test(person);
    }

    public static void main(String[] args) {
        Person person = new Person("ALex", 23);

        Predicate<Person> predicate = p-> p.getAge()>18;

        System.out.println(isEligibleForVoting(person, predicate));
    }
}
