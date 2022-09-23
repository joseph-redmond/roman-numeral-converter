package com.josephredmond.integertoroman.controller;

import com.josephredmond.integertoroman.service.RomanNumeralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

    @Autowired
    private RomanNumeralService romanNumeralService;


    @GetMapping("/")
    public String index(Model model, RomanNumeralService romanNumeralService) {
        model.addAttribute("title", "Integer to Roman Numeral Converter");
        model.addAttribute("description", "Converts an integer to a roman numeral and vice versa");
        model.addAttribute("author", "Joseph Redmond");
        model.addAttribute("github", "https://github.com/joseph-redmond/roman-numeral-converter");
        model.addAttribute("keywords", "Integer, Roman Numeral, Converter");
        return "homepage";
    }
}
