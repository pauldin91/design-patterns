package clean.code.behavioral.strategy;

public class MarkdownListStrategy implements ListStrategy{
    @Override
    public void addItem(StringBuilder sb, String item) {
        sb.append("*")
                .append(item)
                .append(System.lineSeparator());
    }
}
