package clean.code.structural.bridge;

public class Triangle extends Shape{


    public Triangle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public void draw() {
        renderer.renderTriangle();
    }

    @Override
    public void resize(float factor) {

    }
}
