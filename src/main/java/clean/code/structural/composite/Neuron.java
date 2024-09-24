package clean.code.structural.composite;

import java.util.*;
import java.util.function.Consumer;

public class Neuron implements SomeNeurons{
    public ArrayList<Neuron> in,out;

    @Override
    public Iterator<Neuron> iterator() {
        return Collections.singleton(this).iterator();
    }

    @Override
    public void forEach(Consumer<? super Neuron> action) {
        action.accept(this);
    }

    @Override
    public Spliterator<Neuron> spliterator() {
        return Collections.singleton(this).spliterator();

    }
}
