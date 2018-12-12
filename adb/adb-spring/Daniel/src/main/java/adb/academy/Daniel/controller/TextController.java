package adb.academy.Daniel.controller;

import adb.academy.Daniel.api.TextApi;
import adb.academy.Daniel.model.Person;
import adb.academy.Daniel.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/people")
public class TextController implements TextApi {

    @Autowired
    private TextService textService;

    @Override
    public String addFirstName(@RequestBody Person firstName) {
        return textService.addFirstName(firstName);
    }

    @Override
    public String addSecondName(@RequestBody Person secondName) {
        return textService.addSecondName(secondName);
    }

    @Override
    public int addBirthday(@RequestBody Person birthday) {
        return textService.addBirthday(birthday);
    }

    @Override
    public int addFootSize(@RequestBody Person footSize) {
        return textService.addFootSize(footSize);
    }

    @Override
    public ArrayList<ArrayList> getInfo() {
        return textService.getInfo();
    }

}
