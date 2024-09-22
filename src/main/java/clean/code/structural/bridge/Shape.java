package clean.code.structural.bridge;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {

    protected Renderer renderer;
    public Shape(Renderer renderer) {
        this.renderer=renderer;
    }
    public abstract void draw();
    public abstract void resize(float factor);

}
