package com.company;

public class Calculator {

    public static void main(String[] args) {

        int sum = 1;
        for (int i = 0; i <= 100; ++i) {
            sum += sum * i;
            if (sum > 1000) {
                System.out.println(sum);
                break;

            }
        }
    }
}