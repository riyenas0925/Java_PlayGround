package designpattern.strategy;

public class PunchStrategy implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("I have strong punch and attack with it.");
    }
}
