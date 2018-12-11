package com.example.zadanie.controller;

import java.util.List;

import com.example.zadanie.api.TextApi;
import com.example.zadanie.model.TextModel;
import com.example.zadanie.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/text")
public class TextController implements TextApi {

    @Autowired
    private TextService textService;

    @Override
    public String addText(@RequestBody TextModel text) {
        return textService.addText(text);
    }

    @Override
    public List<String> getTexts() {
        return textService.getTexts();
    }
}
