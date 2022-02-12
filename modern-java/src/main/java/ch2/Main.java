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

        List<Apple> result = filterGreenApples(inventory, RED);

        result.stream().forEach(e -> {
            System.out.println(e.getWeight() + ", " + e.getColor());
        });
    }

    public static List<Apple> filterGreenApples(List<Apple> inventory, Color color) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }

        return result;
    }

    public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }

        return result;
    }
}
