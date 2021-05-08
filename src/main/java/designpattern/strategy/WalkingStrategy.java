package designpattern.strategy;

public class WalkingStrategy implements MovingStrategy{
    @Override
    public void move() {
        System.out.println("I can only walk.");
    }
}
