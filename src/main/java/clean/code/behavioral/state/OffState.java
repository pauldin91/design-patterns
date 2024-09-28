package clean.code.behavioral.state;

public class OffState extends State {

    public OffState() {
        System.out.println("Light off");
    }

    @Override
    public void on(LightSwitch ls) {
        System.out.println("Light switching on");
        ls.setState(new OnState());

    }
}
