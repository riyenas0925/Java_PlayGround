package designpattern.state;

public class ON implements State{
    @Override
    public void on_button_pushed(Light light) {
        System.out.println("반응 없음");
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("Light Off!");
        light.setState(new OFF());
    }
}
