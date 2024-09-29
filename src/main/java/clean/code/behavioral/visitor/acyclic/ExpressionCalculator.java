package clean.code.behavioral.visitor.acyclic;

public class ExpressionCalculator implements DoubleExpressionVisitor,AdditionExpressionVisitor {
    private double result;
    @Override
    public void visit(DoubleExpression de) {
        result=de.getValue();
    }

    @Override
    public void visit(AdditionExpression ae) {
        ae.getLhs().accept(this);
        double a = result;
        ae.getRhs().accept(this);
        double b = result;
        result = a+b;
    }

    @Override
    public String toString() {
        return "result = "+result;
    }
}
