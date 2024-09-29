package clean.code.behavioral.visitor.reflective;

public class AdditionExpression extends Expression {
    private Expression lhs,rhs;

    public AdditionExpression(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }


    public Expression getLhs() {
        return lhs;
    }

    public Expression getRhs() {
        return rhs;
    }
}
