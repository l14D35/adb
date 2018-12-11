package adb.academy.Daniel.api;

import adb.academy.Daniel.model.TextModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/text")
public interface TextApi {

    @PostMapping
    String addText(final TextModel text);

    @GetMapping
    List<String> getTexts();


}
