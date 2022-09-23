package com.josephredmond.integertoroman.controller;

import com.josephredmond.integertoroman.service.RomanNumeralService;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

@RestController()
public class RomanNumeralController {
    private RomanNumeralService converter = new RomanNumeralService();

        @PostMapping("/convert")
        @ResponseBody
        public String convert(@RequestBody MultiValueMap<String, String> parameters) {
            System.out.println(parameters);
            if(parameters.containsKey("query")) {
                String query = parameters.getFirst("query");
                if(query.matches("[0-9]+")) {
                    int number = Integer.parseInt(query);
                    return converter.convertFromInt(number);
                }
                else if (query.matches("[IVXLCDM]+")) {
                    return Integer.toString(converter.convertFromRoman(query));
                }
                else {
                    return "Invalid query parameter";
                }
            }
            else {
                return "Missing query parameter";
            }
        }
}
