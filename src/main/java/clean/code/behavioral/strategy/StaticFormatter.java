package clean.code.behavioral.strategy;

import java.util.List;
import java.util.function.Supplier;

public class StaticFormatter <LS extends ListStrategy>{
    private LS strategy;
    private StringBuilder sb = new StringBuilder();

    public StaticFormatter(Supplier<? extends LS> ctor)
    {
        strategy = ctor.get();
    }
    public void append(List<String> items)
    {
        strategy.start(sb);
        for(String item : items)
        {
            strategy.addItem(sb,item);
        }
        strategy.end(sb);
    }
    public void clear()
    {
        sb.setLength(0);
    }

    @Override
    public String toString() {
        return sb.toString();
    }

}
