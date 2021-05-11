package designpattern.command;

public class Button {
    private Lamp theLamp;

    public Button(Lamp theLamp) {
        this.theLamp = theLamp;
    }

    public void pressed() {
        theLamp.turnOn();
    }
}
