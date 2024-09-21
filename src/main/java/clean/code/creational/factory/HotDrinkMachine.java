package clean.code.creational.factory;

import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HotDrinkMachine {
    private final Map<String, HotDrinkFactory> namedFactories = new HashMap<>();

    public HotDrinkMachine() throws Exception {
        Set<Class<? extends HotDrinkFactory>> subTypesOf =
                new Reflections("")
                        .getSubTypesOf(HotDrinkFactory.class);
        for (Class<? extends HotDrinkFactory> type : subTypesOf) {
            namedFactories.put(
                    type.getSimpleName().replace("Factory", ""),
                    type.getDeclaredConstructor().newInstance());
        }
    }

    public HotDrink makeDrink(String name) throws Exception {
        HotDrinkFactory factory = namedFactories.getOrDefault(name, null);
        return factory.Prepare();

    }

}
