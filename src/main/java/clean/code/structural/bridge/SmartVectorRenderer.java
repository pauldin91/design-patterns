package clean.code.structural.bridge;

public class SmartVectorRenderer implements SmartRenderer{
    @Override
    public void render(SmartShape shape) {
        for(Point point : shape)
        {
            System.out.println("Vectoring shape: "+point.toString());
        }
    }
}
