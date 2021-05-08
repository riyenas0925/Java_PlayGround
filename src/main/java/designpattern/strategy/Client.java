package designpattern.strategy;

public class Client {
    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV("TaekwonV");
        taekwonV.setAttackStrategy(new MissileStrategy());
        taekwonV.setMovingStrategy(new WalkingStrategy());

        Robot atom = new Atom("Atom");
        atom.setAttackStrategy(new PunchStrategy());
        atom.setMovingStrategy(new FlyingStrategy());

        System.out.println("My name is " + taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();

        System.out.println();

        System.out.println("My name is " + atom.getName());
        atom.move();
        atom.attack();
    }
}
