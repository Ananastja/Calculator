package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите в строку арифметическое выражение:");
        Scanner scr = new Scanner(System.in);
        String expr = scr.nextLine().replaceAll("\s", "");

        ExactlyCalculator.getNumbers(expr);

    }
}

