package clean.code.creational.builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HtmlElement {
    public String name,text;
    public List<HtmlElement> children = new ArrayList<>();
    private final String newLine = System.lineSeparator();
    private final int indent=2;
    public HtmlElement(){}

    public HtmlElement(String name,String text)
    {
        this.name = name;
        this.text = text;
    }
    @Override
    public String toString()
    {
        return toStringImpl(0);
    }

    private String toStringImpl(int level){
        StringBuilder sb = new StringBuilder();
        String i = String.join("", Collections.nCopies(level* indent," "));
        sb.append(String.format("%s<%s>%s",i,name,newLine));
        if(text != null && !text.isEmpty())
        {
            sb.append(String.join("", Collections.nCopies(indent *(level+1)," ")))
                    .append(text)
                    .append(newLine);

        }
        for(HtmlElement e : children)
            sb.append(e.toStringImpl(indent +1));
        sb.append(String.format("%s</%s>%s",i,name,newLine));
        return sb.toString();
    }
}
