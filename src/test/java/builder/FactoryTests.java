package builder;

import clean.code.creational.factory.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class FactoryTests {
    @Test
    public void hotDrinkMachineTests()
    {
        try {
            HotDrinkMachine machine = new HotDrinkMachine();
            Coffee coffee = (Coffee)machine.makeDrink("Coffee");
            Assertions.assertEquals(coffee.waterMls,200);
            Assertions.assertEquals(coffee.spoons,2);
            Tea tea = (Tea)machine.makeDrink("Coffee");
            Assertions.assertEquals(coffee.waterMls,220);
            Assertions.assertEquals(tea.grams,4);

        } catch (Exception e) {

        }
    }

    public void genericAbstractFactoryTests()
    {
        try
        {
            GenericAbstractFactory machine = new GenericAbstractFactory();
            Map<String,Object> props = new HashMap<>();
            props.put("waterMls",200);
            props.put("spoons",2);
            Coffee coffee = (Coffee)machine.create(props,Coffee.class);
            Assertions.assertEquals(coffee.waterMls,200);
            Assertions.assertEquals(coffee.spoons,2);
            props.clear();
            props.put("waterMls",220);
            props.put("grams",4);
            Tea tea = (Tea)machine.create(props,Tea.class);
            Assertions.assertEquals(coffee.waterMls,220);
            Assertions.assertEquals(tea.grams,4);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
