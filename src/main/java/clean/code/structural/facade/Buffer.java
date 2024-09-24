package clean.code.structural.facade;

public class Buffer {
    private char [] characters;
    private int linewidth;

    public Buffer(int linewidth,int lineheight) {
        this.characters = new char[lineheight*linewidth];
        this.linewidth=linewidth;
    }
    public char charAt(int x,int y)
    {
        return characters[y*linewidth+x];
    }
}
