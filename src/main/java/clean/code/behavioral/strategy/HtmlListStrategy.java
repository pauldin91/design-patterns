package clean.code.behavioral.strategy;

public class HtmlListStrategy implements ListStrategy{

    @Override
    public void start(StringBuilder sb) {
        sb.append("<ul>")
                .append(System.lineSeparator());
    }

    @Override
    public void addItem(StringBuilder sb, String item) {
        sb.append(" <li>")
                .append(item)
                .append("</li>")
                .append(System.lineSeparator());
    }

    @Override
    public void end(StringBuilder sb) {
        sb.append("</ul>")
                .append(System.lineSeparator());

    }
}
