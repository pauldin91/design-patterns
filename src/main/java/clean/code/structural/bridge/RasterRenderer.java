package clean.code.structural.bridge;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Rastering circle of radius "+radius);
    }

    @Override
    public void renderTriangle() {

    }
}
