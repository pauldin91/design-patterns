package clean.code.structural.bridge;

import java.util.ArrayList;

public abstract class SmartShape extends ArrayList<Point> {
    protected abstract void resize(float factor);
    protected abstract double area();

}
