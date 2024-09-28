package clean.code.behavioral.state;

public class OnState extends State {
    public OnState() {
        System.out.println("Light on");
    }

    @Override
    public void off(LightSwitch ls) {
        System.out.println("Light switching off");
        ls.setState(new OffState());
    }
}
