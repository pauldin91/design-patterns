package clean.code.behavioral.state;

import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineBuilder;

import java.util.*;

public class TelephoneMachine {
    private final Map<Position, List<AbstractMap.SimpleEntry<Trigger,Position>>> rules = new HashMap<>();
    private Position currentPos = Position.OFF_HOOK;
    private Position exitPos = Position.ON_HOOK;

    public TelephoneMachine() {
        rules.put(Position.OFF_HOOK,List.of(
                new AbstractMap.SimpleEntry<>(Trigger.CALL_DIALED, Position.CONNECTING),
                new AbstractMap.SimpleEntry<>(Trigger.STOP_USING_PHONE, Position.ON_HOOK)
        ));
        rules.put(Position.CONNECTING,List.of(
                new AbstractMap.SimpleEntry<>(Trigger.HUNG_UP, Position.OFF_HOOK),
                new AbstractMap.SimpleEntry<>(Trigger.CALL_CONNECTED, Position.CONNECTED)
        ));
        rules.put(Position.CONNECTED,List.of(
                new AbstractMap.SimpleEntry<>(Trigger.LEFT_MESSAGE, Position.OFF_HOOK),
                new AbstractMap.SimpleEntry<>(Trigger.HUNG_UP, Position.OFF_HOOK),
                new AbstractMap.SimpleEntry<>(Trigger.PLACED_ON_HOLD, Position.ON_HOLD)
        ));
        rules.put(Position.ON_HOLD,List.of(
                new AbstractMap.SimpleEntry<>(Trigger.TAKEN_OFF_HOLD, Position.CONNECTED),
                new AbstractMap.SimpleEntry<>(Trigger.HUNG_UP, Position.OFF_HOOK)
        ));
    }
    public Map<Position,List<AbstractMap.SimpleEntry<Trigger,Position>>> getRules()
    {
        return rules;
    }
    public void setCurrentPos(Position pos)
    {
        currentPos = pos;
    }

    public Position getCurrentPos() {
        return currentPos;
    }

    public Position getExitPos() {
        return exitPos;
    }

    public StateMachine<Position,Trigger> build() throws Exception {
        StateMachineBuilder.Builder<Position,Trigger> builder = StateMachineBuilder.builder();
        builder
                .configureStates()
                .withStates()
                .initial(Position.OFF_HOOK)
                .states(EnumSet.allOf(Position.class));
        builder
                .configureTransitions()
                .withExternal()
                .source(Position.OFF_HOOK)
                .event(Trigger.CALL_DIALED)
                .target(Position.CONNECTING)
                .and()
                .withExternal()
        //...
        ;

        return builder.build();
    }
}
