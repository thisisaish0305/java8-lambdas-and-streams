package org.educativeio;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonService {

    public static List<Person> getPersons(List<Person> persons){
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return persons;
    }

    //using lambdas
    public static List<Person> getPersonList(List<Person> persons){
        Collections.sort(persons, (p1,p2) -> p1.getName().compareTo(p2.getName()));
        return persons;
    }
}
