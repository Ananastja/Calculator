package com.company;

public enum RomanNumerals {
    I,
    II,
    III,
    IV,
    V,
    VI,
    VII,
    VIII,
    IX,
    X;

    public static String calculateRoman(String a, String b, String oper) {
        RomanNumerals first = findByName(a);
        RomanNumerals second = findByName(b);

        String result;

        switch (oper) {
            case "+":
                result = arabianToRoman(romanToArabian(first) + romanToArabian(second));
                break;
            case "-":
                result = arabianToRoman(romanToArabian(first) - romanToArabian(second));
                break;
            case "*":
                result = arabianToRoman(romanToArabian(first) * romanToArabian(second));
                break;
            case "/":
                result = arabianToRoman(romanToArabian(first) / romanToArabian(second));
                break;
            default:
                throw new IllegalArgumentException();
        }
        return  result;

    }

    private static RomanNumerals findByName(String name) {
        for (RomanNumerals num : values()) {
            if (num.name().equals(name)) {
                return num;
            }
        }
        throw new IllegalArgumentException();
    }

    public static int romanToArabian(RomanNumerals r) {
        int x = r.ordinal() + 1;
        return x;
    }

    public static String arabianToRoman(int a) {
        String y = null;
        if (a > 0 && a <= 10) {
            y = RomanNumerals.values()[a - 1].toString();
        } else if (a > 10 && a < 20) {
            y = "X" + RomanNumerals.values()[a % 10 - 1].toString();
        } else if (a == 20) {
            y = "XX";
        } else if (a > 20 && a < 30) {
            y = "XX" + RomanNumerals.values()[a % 10 - 1].toString();
        } else if (a == 30) {
            y = "XXX";
        } else if (a > 30 && a < 40) {
            y = "XXX" + RomanNumerals.values()[a % 10 - 1].toString();
        } else if (a == 40) {
            y = "XL";
        } else if (a > 40 && a < 50) {
            y = "XL" + RomanNumerals.values()[a % 10 - 1].toString();
        } else if (a == 50) {
            y = "L";
        } else if (a > 50 && a < 60) {
            y = "L" + RomanNumerals.values()[a % 10 - 1].toString();
        } else if (a == 60) {
            y = "LX";
        } else if (a > 60 && a < 70) {
            y = "LX" + RomanNumerals.values()[a % 10 - 1].toString();
        } else if (a == 70) {
            y = "LXX";
        } else if (a > 70 && a < 80) {
            y = "LXX" + RomanNumerals.values()[a % 10 - 1].toString();
        } else if (a == 80) {
            y = "LXXX";
        } else if (a > 80 && a < 90) {
            y = "LXXX" + RomanNumerals.values()[a % 10 - 1].toString();
        } else if (a == 90) {
            y = "XCV";
        } else if (a > 90 && a < 100) {
            y = "XCV" + RomanNumerals.values()[a % 10 - 1].toString();
        } else if (a == 100) {
            y = "C";
        } else throw new IllegalArgumentException();

        return y;
    }

}

