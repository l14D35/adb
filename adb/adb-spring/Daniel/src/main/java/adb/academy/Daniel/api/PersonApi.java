package adb.academy.Daniel.api;

import adb.academy.Daniel.model.Person;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/people")
public interface PersonApi {

    @PostMapping
    Person addPerson(Person p);

/*
    @PutMapping
    public List<Person> updatePerson(Person p);

    @DeleteMapping
    public List<Person> deletePerson(Person p);
*/

    @GetMapping("/people")
    public List<Person> getInfo();

    @GetMapping("/people/{id}")
    public Person getPersonById(Long id);

}
