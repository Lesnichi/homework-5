package com.vl.homework5.Task2;

public class RomanConverter {

    private int convertOneLetter(char romanLetter) {
        switch (romanLetter) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                return 0;
        }
    }

    public int convertAllLetters(String roman) {
        int result = 0;
        for (int i = 0; i < roman.length()-1; i++) {
            if (convertOneLetter(roman.charAt(i)) < convertOneLetter(roman.charAt(i + 1))) {
                result -= convertOneLetter(roman.charAt(i));
            } else {
                result += convertOneLetter(roman.charAt(i));
            }
        }
        result += convertOneLetter(roman.charAt(roman.length() - 1));
        return result;
    }
}
