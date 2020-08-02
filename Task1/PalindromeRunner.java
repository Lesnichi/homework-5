package com.vl.homework5.Task1;

/**
 * 1. Проверить, является ли введённая строка палиндромом, т.е. читается
 * одинаково в обоих направлениях
 */
public class PalindromeRunner {

    public static void main(String[] args) {
        String firstString = "ABBA";
        System.out.println(firstString);
        StringBuilder secondString = new StringBuilder(firstString);
        secondString.reverse();
        System.out.println(secondString);
        if (firstString.equals(String.valueOf(secondString))) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
    }
}