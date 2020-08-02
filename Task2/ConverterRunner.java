package com.vl.homework5.Task2;

/**
 * 2. Написать программу, преобразующую строку, содержащую число в
 * римском формате, в число в арабском формате.
 * Границы чисел: от 1 до 3999. Предусмотреть случай, когда меньший символ
 * идёт перед большим:
 * Например CM == 900.
 * Соответствие:
 * M 1000            
 * D 500            
 * C 100            
 * L 50
 * X 10
 * V 5
 * I 1
 */
public class ConverterRunner {

    public static void main(String[] args) {
        String roman = "CM";
        RomanConverter romanNumerals = new RomanConverter();
        System.out.println(romanNumerals.convertAllLetters(roman));
    }
}
