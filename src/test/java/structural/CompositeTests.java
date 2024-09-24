package structural;

import clean.code.structural.composite.Circle;
import clean.code.structural.composite.GraphicObject;
import clean.code.structural.composite.Rectangle;
import org.junit.jupiter.api.Test;

public class CompositeTests {
    @Test
    public void graphiObjectsTest()
    {
        GraphicObject go = new GraphicObject();
        go.setName("My Drawing");
        GraphicObject circle1 = new Circle("red");
        GraphicObject square = new Rectangle("blue");
        GraphicObject circle2 = new Circle("red");
        go.children.add(circle1);
        go.children.add(square);
        go.children.add(circle2);
        GraphicObject group = new GraphicObject();
        group.setName("Group");
        group.children.add(circle1);
        group.children.add(square);
        group.children.add(circle2);
        go.children.add(group);
        System.out.println(go);

    }
}
