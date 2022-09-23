package com.josephredmond.integertoroman.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@Scope("singleton")
public class RomanNumeralService {
    private HashMap<Integer, String> romanNumerals = new HashMap<Integer, String>();

    public RomanNumeralService() {
        this.fillHashMap();
    }
    private boolean fillHashMap() {
        try {
            if(romanNumerals.isEmpty()){
                romanNumerals.put(1, "I");
                romanNumerals.put(4, "IV");
                romanNumerals.put(5, "V");
                romanNumerals.put(9, "IX");
                romanNumerals.put(10, "X");
                romanNumerals.put(40, "XL");
                romanNumerals.put(50, "L");
                romanNumerals.put(90, "XC");
                romanNumerals.put(100, "C");
                romanNumerals.put(400, "CD");
                romanNumerals.put(500, "D");
                romanNumerals.put(900, "CM");
                romanNumerals.put(1000, "M");
                return true;
            }
            return false;
        }
        catch(Exception e) {
            return false;
        }
    }

    public String convertFromInt(int number) {
        if(this.romanNumerals.containsKey(number)) {
            return this.romanNumerals.get(number);
        }
        else {
            String romanNumeral = "";
            int remainder = number;
            while(remainder > 0) {
                int largestKey = 0;
                for(int key : this.romanNumerals.keySet()) {
                    if(key <= remainder && key > largestKey) {
                        largestKey = key;
                    }
                }
                romanNumeral += this.romanNumerals.get(largestKey);
                remainder -= largestKey;
            }
            return romanNumeral;
        }
    }

    public int convertFromRoman(String romanNumeral) {
        int number = 0;
        int i = 0;
        while(i < romanNumeral.length()) {
            if(i + 1 < romanNumeral.length()) {
                String twoChars = romanNumeral.substring(i, i + 2);
                if(this.romanNumerals.containsValue(twoChars)) {
                    for(int key : this.romanNumerals.keySet()) {
                        if(this.romanNumerals.get(key).equals(twoChars)) {
                            number += key;
                            i += 2;
                        }
                    }
                }
                else {
                    String oneChar = romanNumeral.substring(i, i + 1);
                    for(int key : this.romanNumerals.keySet()) {
                        if(this.romanNumerals.get(key).equals(oneChar)) {
                            number += key;
                            i += 1;
                        }
                    }
                }
            }
            else {
                String oneChar = romanNumeral.substring(i, i + 1);
                for(int key : this.romanNumerals.keySet()) {
                    if(this.romanNumerals.get(key).equals(oneChar)) {
                        number += key;
                        i += 1;
                    }
                }
            }
        }
        return number;
    }
}
