package clean.code.behavioral.visitor.classic;

public abstract class Expression {
    public abstract void accept(ExpressionVisitor visitor);
}
