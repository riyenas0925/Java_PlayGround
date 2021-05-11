package designpattern.command;

public class Client {
    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        Button lampButton = new Button(alarm);
        lampButton.pressed();
    }
}
