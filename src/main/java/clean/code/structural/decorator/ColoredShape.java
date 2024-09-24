package clean.code.structural.decorator;

public class ColoredShape implements Shape{
    private String color;
    private Shape shape;

    public ColoredShape(String color, Shape shape) {
        this.color = color;
        this.shape = shape;
    }
    @Override
    public String info() {
        return shape.info()+" has color of "+color;
    }
}

