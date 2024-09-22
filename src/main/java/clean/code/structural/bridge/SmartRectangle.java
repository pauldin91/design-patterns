package clean.code.structural.bridge;

public class SmartRectangle extends SmartShape{
    private float width;
    private float height;

    public SmartRectangle(int width,int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    protected void resize(float factor) {
        this.height*=factor;
        this.width*=factor;
    }

    @Override
    protected double area() {
        return height*width*1.0d;
    }
}
