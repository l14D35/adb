package com.example.zadanie.service;

import java.util.ArrayList;
import java.util.List;

import com.example.zadanie.model.TextModel;
import org.springframework.stereotype.Service;

@Service
public class TextService {

    private static List<String> texts;

    static {
        texts = new ArrayList<>();
//        texts.add("Jakis text");
//        texts.add("Jakis text2");
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
