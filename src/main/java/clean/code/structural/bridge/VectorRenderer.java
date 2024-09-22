package clean.code.structural.bridge;

public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Vectorizing circle of radius="+radius);
    }

    @Override
    public void renderTriangle() {

    }
}
