package designpattern.command;

public class Button {
    private Lamp theLamp;
    private Alarm theAlarm;
    private Mode theMode;

    public Button(Lamp theLamp, Alarm theAlarm) {
        this.theLamp = theLamp;
        this.theAlarm = theAlarm;
    }

    public void setMode(Mode theMode) {
        this.theMode = theMode;
    }

    public void pressed() {
        switch (theMode) {
            case LAMP:
                theLamp.turnOn();
                break;
            case ALARM:
                theAlarm.turnOn();
        }
    }
}
