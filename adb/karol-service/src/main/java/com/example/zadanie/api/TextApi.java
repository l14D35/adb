package com.example.zadanie.api;

import java.util.List;

import com.example.zadanie.model.TextModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/text")
public interface TextApi {

    @PostMapping
    String addText(final TextModel text);

    @GetMapping
    List<String> getTexts();

}
