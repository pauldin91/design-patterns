package clean.code.behavioral.strategy;

import java.util.List;

public class TextProcessor {
    private ListStrategy strategy;
    private StringBuilder sb = new StringBuilder();

    public TextProcessor(OutputFormat format) {
        setFormat(format);
    }

    public void setFormat(OutputFormat format) {
        switch(format)
        {
            case HTML -> strategy=new HtmlListStrategy();
            case MARKDOWN -> strategy=new MarkdownListStrategy();
        }
    }
    public void append(List<String> items)
    {
        strategy.start(sb);
        for(String item : items)
        {
            strategy.addItem(sb,item);
        }
        strategy.end(sb);
    }
    public void clear()
    {
        sb.setLength(0);
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
