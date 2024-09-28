package behavioral;

import clean.code.behavioral.state.LightSwitch;
import clean.code.behavioral.state.Position;
import clean.code.behavioral.state.TelephoneMachine;
import clean.code.behavioral.state.Trigger;
import org.junit.jupiter.api.Test;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineBuilder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.AbstractMap;
import java.util.List;

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
