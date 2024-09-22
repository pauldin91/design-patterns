package clean.code.structural.bridge;

public class SmartCircle extends SmartShape{
    private int radius;

    public SmartCircle(int radius) {
        this.radius = radius;
    }

    @Override
    protected void resize(float factor) {
        radius*=factor;
    }

    @Override
    protected double area() {
        return Math.PI*radius*radius;
    }
}
