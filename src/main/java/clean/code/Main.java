package clean.code;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.util.function.Consumer;


    interface ValueContainer extends Iterable<SingleValue> {
        int getValue();
        default public int sum()
        {
            int summ=0;
            for(ValueContainer val:this){
                summ+=val.getValue();
            }
            return summ;
        }
    }

    class SingleValue implements ValueContainer
    {
        public int value;

        // please leave this constructor as-is
        public SingleValue(int value)
        {
            this.value = value;
        }
        @Override
        public Iterator<SingleValue> iterator() {
            return Collections.singleton(this).iterator();
        }

        @Override
        public void forEach(Consumer<? super SingleValue> action) {
            action.accept(this);
        }

        @Override
        public Spliterator<SingleValue> spliterator() {
           return Collections.singleton(this).spliterator();

        }

        @Override
        public int getValue() {
            return value;
        }
    }

    class ManyValues extends ArrayList<SingleValue> implements ValueContainer
    {
        @Override
        public int getValue() {
            int summ=0;
            for (SingleValue val:this){
                summ+=val.getValue();
            }
            return summ;
        }
    }


    class MyList extends ArrayList<ValueContainer>
    {
        // please leave this constructor as-is
        public MyList(Collection<? extends ValueContainer> c)
        {
            super(c);
        }

    }
public class Main {
    public static void main(String[] args) {

    }
}

