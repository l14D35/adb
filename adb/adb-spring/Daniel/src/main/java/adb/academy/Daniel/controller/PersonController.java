package adb.academy.Daniel.controller;

import adb.academy.Daniel.api.PersonApi;
import adb.academy.Daniel.model.Person;
import adb.academy.Daniel.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/people")
public class PersonController implements PersonApi {

    @Autowired
    private PersonService textService;

    @Override
    @PostMapping("/people")
    public Person addPerson(@RequestBody Person p) {
        return textService.addPerson(p);
    }

   /* @Override
    public List<Person> updatePerson(@RequestBody Person p) {
        return textService.updatePerson(p);
    }

    @Override
    public List<Person> deletePerson(@PathVariable Person p) {
        return textService.deletePerson(p);
    }*/

    @Override
    @GetMapping("/people")
    public List<Person> getInfo() {
        return textService.getInfo();
    }

    @Override
    @GetMapping("/people/{id}")
    public Person getPersonById(Long id) {
        return textService.getPersonById(id);
    }

}
