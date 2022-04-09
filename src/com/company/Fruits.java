package com.company;

import java.util.Arrays;

public class Fruits {

    public static void main(String[] args) {
        String[] fruits = new String[]{"Apples", "bananas", "orenges", "cherries",
                "mandarin", "pear", "lemon", "watermalon", "strawberries", "grapes"};

        String[] food = fruits;
        String[] fruitsCopy = Arrays.copyOf(fruits, fruits.length);
        System.out.println(Arrays.toString(food));
    }
}
