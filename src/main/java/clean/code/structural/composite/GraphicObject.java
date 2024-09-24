package clean.code.structural.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GraphicObject {
    protected String name = "Group";
    public String color;
    public List<GraphicObject> children = new ArrayList<>();
    public GraphicObject() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void print(StringBuilder sb,int level)
    {
        sb.append(String.join("", Collections.nCopies(level,"*")))
                .append(level>0 ? " ":"")
                .append((color==null||color.isEmpty())?"":color+" ")
                .append(getName())
                .append(System.lineSeparator());
        for(GraphicObject go:children)
        {
            go.print(sb,level+1);
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        print(sb,0);
        return sb.toString();
    }
}
