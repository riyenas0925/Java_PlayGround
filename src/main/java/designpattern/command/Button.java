package designpattern.command;

public class Button {
    private Command theCommand;

    public Button(Command theCommand) {
        setCommand(theCommand);
    }

    public void setCommand(Command theCommand) {
        this.theCommand = theCommand;
    }

    public void pressed() {
        theCommand.execute();
    }
}
