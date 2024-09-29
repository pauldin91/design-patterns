package clean.code.behavioral.visitor.acyclic;

public class AdditionExpression extends Expression {
    private Expression lhs,rhs;

    public AdditionExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public void accept(Visitor visitor)
    {
        if(visitor instanceof AdditionExpressionVisitor)
            ((AdditionExpressionVisitor)visitor).visit(this);

    }
    public Expression getLhs() {
        return lhs;
    }

    public Expression getRhs() {
        return rhs;
    }
}
