package behavioral;

import clean.code.behavioral.state.LightSwitch;
import org.junit.jupiter.api.Test;

public class StateTests {
    @Test
    public void lightStateTests(){
        LightSwitch ls = new LightSwitch();
        ls.on();
        ls.off();
        ls.off();
        ls.on();
        ls.on();
        ls.off();

    }

}
