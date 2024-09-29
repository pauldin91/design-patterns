package clean.code.behavioral.visitor.classic;

public interface ExpressionVisitor {
    void visit(DoubleExpression de);
    void visit(AdditionExpression ae);
}
