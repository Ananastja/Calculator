package com.company;


public class ExactlyCalculator {

    public static void getNumbers(String expression) {

        String operand = "";
        String firstDigit, secondDigit;

        String[] arr = expression.split("[+-/*]");
        firstDigit = arr[0];
        secondDigit = arr[1];
        operand = Character.toString(expression.charAt(arr[0].length()));

        try {
            if (Integer.parseInt(firstDigit) > 0 && Integer.parseInt(firstDigit) < 10 && Integer.parseInt(secondDigit) > 0 && Integer.parseInt(secondDigit) < 10) {
                ArabianNumerals.calculateArabian(Integer.parseInt(firstDigit), Integer.parseInt(secondDigit), operand);
            } else {
                throw new IllegalArgumentException();
            }
        } catch (NumberFormatException e) {
            RomanNumerals.calculateRoman(firstDigit.toUpperCase(), secondDigit.toUpperCase(), operand);
        } catch (Exception e) {
            throw e;
        }
    }
}

