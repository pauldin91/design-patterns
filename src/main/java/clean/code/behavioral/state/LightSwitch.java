package clean.code.behavioral.state;

public class LightSwitch {
    private State state;

    public LightSwitch() {
        this.state = new OffState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void on() {
        state.on(this);
    }

    public void off() {
        state.off(this);
    }
}
