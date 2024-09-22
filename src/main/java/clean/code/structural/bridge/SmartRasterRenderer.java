package clean.code.structural.bridge;

public class SmartRasterRenderer implements SmartRenderer {
    @Override
    public void render(SmartShape shape) {
        for(Point point : shape)
        {
            System.out.println("Rastering shape: "+point.toString());
        }
    }
}
