package clean.code.behavioral.visitor.classic;

public class DoubleExpression extends Expression
{
    private double value;

    public DoubleExpression(double value) {
        this.value = value;
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }

    public double getValue() {
        return value;
    }
}
