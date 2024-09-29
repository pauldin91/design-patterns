package clean.code.behavioral.visitor.classic;

public class ExpressionPrinter implements ExpressionVisitor {
    private final StringBuilder sb = new StringBuilder();

    @Override
    public void visit(DoubleExpression de) {
        sb.append(de.getValue());
    }

    @Override
    public void visit(AdditionExpression ae) {
        sb.append("(");
        ae.getLhs().accept(this);
        sb.append("+");
        ae.getRhs().accept(this);
        sb.append(")");
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
