package clean.code.structural.decorator;

public class Circle implements Shape{
    private float radius;

    public Circle() {

    }

    public Circle(float radius) {
        this.radius = radius;
    }
    public void resize(float factor)
    {
        radius*=factor;
    }
    @Override
    public String info() {
        return "Circle with radius "+radius;
    }
}
