package com.company;


public class ExactlyCalculator {

    public static String getNumbers(String expression) {

        String operand = "";
        String res = "";
        String firstDigit, secondDigit;

        String[] arr = expression.split("[+-/*]");
        if (arr.length == 2) {
            firstDigit = arr[0];
            secondDigit = arr[1];
            operand = Character.toString(expression.charAt(arr[0].length()));
        } else {
            throw new RuntimeException("Больше 2 операндов");
        }

        try {
            if (Integer.parseInt(firstDigit) > 0 && Integer.parseInt(firstDigit) < 10 && Integer.parseInt(secondDigit) > 0 && Integer.parseInt(secondDigit) < 10) {
                res = ArabianNumerals.calculateArabian(Integer.parseInt(firstDigit), Integer.parseInt(secondDigit), operand);
                return res;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (NumberFormatException e) {
            res = RomanNumerals.calculateRoman(firstDigit.toUpperCase(), secondDigit.toUpperCase(), operand);
            return res;
        } catch (Exception e) {
            throw e;
        }
    }
}

