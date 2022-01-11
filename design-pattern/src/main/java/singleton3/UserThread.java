package singleton3;

public class UserThread extends Thread{
    public UserThread(String name) {
        super(name);
    }

    public void run() {
        Printer.print(Thread.currentThread().getName() + " print using " + ".");
    }
}
