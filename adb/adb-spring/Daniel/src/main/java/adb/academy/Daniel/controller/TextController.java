package adb.academy.Daniel.controller;

import adb.academy.Daniel.api.TextApi;
import adb.academy.Daniel.model.Person;
import adb.academy.Daniel.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/people")
public class TextController implements TextApi {

    @Autowired
    private TextService textService;

    @Override
    public Person addPerson(@RequestBody Person p) {
        return textService.addPerson(p);
    }


    @Override
    public List<Person> getInfo() {
        return textService.getInfo();
    }

}
