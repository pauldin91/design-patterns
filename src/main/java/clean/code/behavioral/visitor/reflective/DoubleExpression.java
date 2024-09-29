package clean.code.behavioral.visitor.reflective;

public class DoubleExpression extends Expression
{
    private double value;

    public DoubleExpression(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
