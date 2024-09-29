package clean.code.behavioral.visitor.acyclic;


public interface DoubleExpressionVisitor extends Visitor{
    void visit(DoubleExpression de);
}
