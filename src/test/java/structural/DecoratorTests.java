package structural;

import clean.code.structural.decorator.Circle;
import clean.code.structural.decorator.ColoredShape;
import clean.code.structural.decorator.TransparrentShape;
import org.junit.jupiter.api.Test;

public class DecoratorTests {

    @Test
    public void decorateTests()
    {
        TransparrentShape<ColoredShape> shpae = new TransparrentShape<>(()->new ColoredShape("black",new Circle(1.0f)),0.4f);
        System.out.println(shpae.info());
    }
}
