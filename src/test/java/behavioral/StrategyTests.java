package behavioral;

import clean.code.behavioral.strategy.*;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

public class StrategyTests {
    @Test
    public void strategyTests()
    {
        TextProcessor tp = new TextProcessor(OutputFormat.MARKDOWN);
        tp.append(List.of("one","two","three"));
        System.out.println(tp);
        tp.setFormat(OutputFormat.HTML);
        tp.append(List.of("inheritance","encapsulation","polymorphism"));
        System.out.println(tp);
    }
    @Test
    public void staticStrategyTests()
    {
        StaticFormatter<HtmlListStrategy> tp = new StaticFormatter<>(HtmlListStrategy::new);
        tp.append(List.of("one","two","three"));
        System.out.println(tp);
        tp.append(List.of("inheritance","encapsulation","polymorphism"));
        System.out.println(tp);
    }

}
