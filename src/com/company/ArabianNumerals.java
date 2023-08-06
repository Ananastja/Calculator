package com.company;

public class ArabianNumerals {
    public static void calculateArabian(int a, int b, String oper) {
        int result;
        try {
            switch (oper) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "/":
                    result = a / b;
                    break;
                case "*":
                    result = a * b;
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            System.out.println(result);
        } catch (NullPointerException e) {
            throw e;
        }
    }
}
