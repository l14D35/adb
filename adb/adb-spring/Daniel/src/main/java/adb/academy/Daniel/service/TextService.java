package adb.academy.Daniel.service;

import adb.academy.Daniel.model.TextModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TextService {

    private static List<String> texts;

    static {
        texts = new ArrayList<>();
        texts.add("texts");
        texts.add("REEEEEEEEEEEEEEEEEEEEEeee");
    }


    public String addText(TextModel text) {
        final String adb = text.getText();
        texts.add(adb);
        return adb;
    }

    public List<String> getTexts() {
        return texts;
    }
}
