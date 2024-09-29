package clean.code.behavioral.visitor.acyclic;

public class DoubleExpression extends Expression
{
    private double value;

    public DoubleExpression(double value) {
        this.value = value;
    }

    @Override
    public void accept(Visitor visitor)
    {
        if(visitor instanceof DoubleExpressionVisitor)
            ((DoubleExpressionVisitor)visitor).visit(this);

    }

    public double getValue() {
        return value;
    }
}
