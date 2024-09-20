package clean.code.creational.builder;

public class HtmlBuilder {

    private String rootName;
    private HtmlElement root = new HtmlElement();
    public HtmlBuilder(String rootName)
    {
        this.rootName = rootName;
        root.name=rootName;
    }

    public HtmlBuilder addChild(String name,String text)
    {
        HtmlElement e = new HtmlElement(name,text);
        root.children.add(e);
        return this;
    }
    public void clear(){
        root = new HtmlElement();
        root.name=rootName;
    }
    public HtmlElement build()
    {
        return root;
    }

}
