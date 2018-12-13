package adb.academy.Daniel.service;

import adb.academy.Daniel.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    private static List<Person> persons;

    static {
        persons = new ArrayList<>();

        persons.add(new Person("Reee", "ree", 3, 44));
        persons.add(new Person("ijasoijdoia", "asjidjsaijdsad", 3, 2));
    }

    public Person addPerson(Person p) {
         persons.add(new Person(p.getFirstName(), p.getSecondName(), p.getBirthday(), p.getFootSize()));
        return persons.get(persons.size() - 1);
    }

    public List<Person> getInfo() {
        return persons;
    }

    public Person getPersonById(Long id) {
        return persons.get(id.intValue());
    }

    /**
     * Tutaj problem z updatePerson, bez żadnego ID musiałbym zrobić 2^4 warunków
     */
   /* public List<Person> updatePerson(Person p) {
        final String first = p.getFirstName();
        final String second = p.getSecondName();
        final int birth = p.getBirthday();
        final int foot = p.getFootSize();

        for (Person per : persons) {
            if (per.getFirstName().equals(p.getFirstName())) {
                if (per.getSecondName().equals(p.getSecondName())) {

                }
            }
        }
        return persons;
    }

    public List<Person> deletePerson(Person p) {
        for (int i = 0; i < persons.size(); i++) {
            if (p.equals(persons.get(i)))
                persons.remove(p);
        }
        return persons;
    }*/
}
