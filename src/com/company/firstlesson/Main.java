package com.company.firstlesson;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world!");
        byte a = 127; // -128...127
        short b = -32768; // -32768...32767
        int c = 2147480500; // -2,147,483,648..2,147,483,647
        long d = 120_000_000; // -9,223,372,036,854,775,808..9,223,372,036,854,775,807
        // 10000000 = 64 // 0 * 2^0 + 0 * @

        long A = 1000;
        for (int i = 0; i < 6; i++) {
            A = A * A;

        }
    }
}

