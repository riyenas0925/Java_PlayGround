package ch2;

public class AppleFancyFormatter implements AppleFormatter {
    @Override
    public String accept(Apple apple) {
        String str = apple.getWeight() > 150 ? "heavy" : "light";
        return "A " + str + " " + apple.getColor() + " apple";
    }
}
