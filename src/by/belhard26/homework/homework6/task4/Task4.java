package by.belhard26.homework.homework6.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    private static List<Person> persons = Arrays.asList(
            new Person("Vasily"),
            new Person("Tatyana"),
            new Person("Igor"),
            new Person("Nikolay"),
            new Person("Pahom"),
            new Person("Vasily")
    );

    public static void main(String[] args) {

        Person person = getPersonByName("Nikolay");
        System.out.println(person == null ? "null" : person.toString());
        System.out.println();

        Person person1 = getPersonByName("Mark");
        System.out.println(person1 == null ? "null" : person1.toString());
        System.out.println();

        Person person2 = getPersonByName("Vasily");
        System.out.println(person2 == null ? "null" : person2.toString());
        System.out.println();

        System.out.println(persons);
        persons.forEach(p -> System.out.printf("%s : %s\n", p.getName(), p ));

        }
    
    private static Person getPersonByName (String name) {
    for (Person person: persons)
        if (person.getName().contains(name))
            return person;

    return null;
    }
}
      




    

