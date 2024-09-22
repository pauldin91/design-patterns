package clean.code.structural.bridge;

public class Circle extends Shape{
    public float radius;

    public Circle(Renderer renderer, float radius) {
        super(renderer);
        this.radius=radius;
    }
    public Circle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public void draw() {
        renderer.renderCircle(radius);
    }

    @Override
    public void resize(float factor) {
        radius*=factor;
    }
}
