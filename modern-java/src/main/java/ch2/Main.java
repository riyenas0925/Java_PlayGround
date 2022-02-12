package ch2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static ch2.Color.GREEN;
import static ch2.Color.RED;

public class Main {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(GREEN, 80),
                new Apple(GREEN, 155),
                new Apple(RED, 120)
        );

        List<Apple> result = filterApples(inventory, new AppleGreenColorPredicate());
        prettyPrintApple(result, new AppleFancyFormatter());
    }

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }

    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter f) {
        for (Apple apple : inventory) {
            System.out.println(f.accept(apple));
        }
    }

}
