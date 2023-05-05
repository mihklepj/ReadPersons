import models.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainArrayMulti {
    public static void main(String[] args) {
        // Create one person at a time
        Person person1 = new Person("Justin", "Mihklep", 31);
        // Show person1
        System.out.println(person1.getLastname()+" "+ person1.getFirstname()+" "+ person1.getAge());
        // Create new person
        Person person2 = new Person("Alar", "Karis", 65);
        System.out.println("Age difference: " + (person2.getAge()- person1.getAge()));

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(new Person("Toomas-Hendrik", "Ilves", 70));


        showListMulti(persons);
        persons.get(0).setFirstname("Arnold");
        persons.get(0).setLastname("Rüütel");
        persons.get(0).setAge(94);
        System.out.println("------");
        showListMulti(persons);
        System.out.println("------");
        persons.add(new Person("Lennart", "Meri", 76));
        Collections.sort(persons, Comparator.comparing(Person::getLastname));
        showListMulti(persons);
        // Collections.sort(agentDtoList, (o1, o2) -> o1.getCustomerCount() - o2.getCustomerCount());

    }

    private static void showListMulti(List<Person> persons) {
        int x = 0;
        for(Person p : persons) {
            System.out.println(x + " " + p.getFirstname() + " " + p.getLastname() + " " + p.getAge());
            x++;
        }
    }
}
