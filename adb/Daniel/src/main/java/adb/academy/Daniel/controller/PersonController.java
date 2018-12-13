package adb.academy.Daniel.controller;

import adb.academy.Daniel.api.PersonRepository;
import adb.academy.Daniel.model.PersonEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class PersonController {
    private final PersonRepository persons;

    @GetMapping("/persons")
    List<PersonEntity> all() {
        return persons.findAll();
    }

    @PostMapping("/persons")
    PersonEntity newPerson(@RequestBody PersonEntity p) {
        return persons.save(p);
    }

    @GetMapping("/persons/{id}")
    Optional<PersonEntity> one(@PathVariable Long id) {

        return persons.findById(id);
    }

    @PutMapping("/persons/{id}")
    PersonEntity updatePerson(@RequestBody PersonEntity p, @PathVariable Long id) {

        return persons.findById(id)
                .map(person -> {
                    person.setFirstName(p.getFirstName());
                    person.setSecondName(p.getSecondName());
                    person.setBirthday(p.getBirthday());
                    person.setFootSize(p.getFootSize());
                    return persons.save(person);
                })
                .orElseGet(() -> {
                    p.setId(id);
                    return persons.save(p);
                });
    }

    @DeleteMapping("/persons/{id}")
    void deletePerson(@PathVariable Long id) throws RuntimeException {
        persons.deleteById(id);


    }


}
