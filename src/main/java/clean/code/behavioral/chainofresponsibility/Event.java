package clean.code.behavioral.chainofresponsibility;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Event<Args> {
    private final Map<Integer, Consumer<Args>> handlers = new HashMap<>();
    private int index = 0;

    public int subscribe(Consumer<Args> handler) {
        int i = index;
        handlers.put(index++, handler);
        return i;
    }

    public void unsubscribe(int key) {
        handlers.remove(key);
    }

    public void fire(Args args) {
        for (Consumer<Args> handler : handlers.values()) {
            handler.accept(args);
        }
    }
}
