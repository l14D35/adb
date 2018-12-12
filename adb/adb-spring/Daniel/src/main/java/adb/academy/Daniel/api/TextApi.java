package adb.academy.Daniel.api;

import adb.academy.Daniel.model.Person;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/people")
public interface TextApi {

    @PostMapping
    String addFirstName(final Person firstName);
    String addSecondName(final Person secondName);
    int addBirthday(final Person birthday);
    int addFootSize(final Person footSize);

   @GetMapping
   ArrayList<ArrayList> getInfo();

}
