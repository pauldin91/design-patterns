package clean.code.structural.facade;

import java.util.ArrayList;
import java.util.List;

public class Console {
    private List<Viewport> viewports = new ArrayList<>();
    private int height,width;

    public Console(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public void add(Viewport viewport)
    {
        viewports.add(viewport);
    }
    public void render(){
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                for(Viewport vp:viewports)
                {
                    System.out.println(vp.charAt(x,y));
                }
            }
        }
    }
    //add init method so that client code is simplified
    public static Console newConsole(int width,int height)
    {
        Buffer buffer = new Buffer(width,height);
        Viewport vp = new Viewport(buffer,width, height, 0, 0);
        Console console = new Console(width,height);
        console.add(vp);
        return console;
    }
}
