package clean.code.structural.decorator;

import java.util.function.Supplier;

public class TransparrentShape<T extends Shape> implements Shape
{
    private float transparrency;
    private Shape shape;

    public TransparrentShape(Supplier<? extends T> ctor, float transparrency) {

        this.transparrency = transparrency;
        shape = ctor.get();
    }
    @Override
    public String info() {
        return "";
    }
}
