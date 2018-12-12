package adb.academy.Daniel.service;

import adb.academy.Daniel.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/*
{
        "firstName" : "string",
        "secondName" : "string",
        "birthay" : 1544605646,
        "footSize": 41
        }
*/


@Service
public class TextService {

    private static List<Person> persons;



    static {
        persons = new ArrayList<>();

        persons.add(new Person("Jan","Kowalski", 18081998, 13));
        persons.add(new Person("Roman","Nowak", 28081998, 33));

    }


    public Person addPerson(Person p) {
        final String first = p.getFirstName();
        final String second = p.getSecondName();
        final int birth = p.getBirthday();
        final int foot = p.getFootSize();

        persons.add(new Person(p.getFirstName(), p.getSecondName(), p.getBirthday(), p.getFootSize()));
        return persons.get(persons.size() - 1);
    }

    public List<Person> getInfo() {
        return persons;
    }

}
