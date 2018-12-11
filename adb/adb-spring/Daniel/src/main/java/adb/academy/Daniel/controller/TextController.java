package adb.academy.Daniel.controller;

import adb.academy.Daniel.api.TextApi;
import adb.academy.Daniel.model.TextModel;
import adb.academy.Daniel.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.spi.WebServiceFeatureAnnotation;
import java.util.List;

@RestController
@RequestMapping("/text")
public class TextController implements TextApi {

    @Autowired
    private TextService textService;

    @Override
    public String addText(TextModel text) {
        return textService.addText(text);
    }

    @Override
    public List<String> getTexts() {
        return textService.getTexts();
    }
}
