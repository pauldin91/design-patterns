package clean.code.behavioral.visitor.acyclic;

public abstract class Expression {
    public void accept(Visitor visitor)
    {
        if(visitor instanceof ExpressionVisitor)
            ((ExpressionVisitor)visitor).visit(this);

    }
}
