package adb.academy.Daniel.api;

import adb.academy.Daniel.model.Person;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public interface TextApi {

    @PostMapping
    Person addPerson(Person p);



   @GetMapping
   public List<Person> getInfo();

}
