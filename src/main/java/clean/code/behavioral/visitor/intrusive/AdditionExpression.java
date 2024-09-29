package clean.code.behavioral.visitor.intrusive;

public class AdditionExpression extends Expression {
    private Expression lhs,rhs;

    public AdditionExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public void print(StringBuilder sb) {
        sb.append("(");
        lhs.print(sb);
        sb.append("+");
        rhs.print(sb);
        sb.append(")");
    }
}
