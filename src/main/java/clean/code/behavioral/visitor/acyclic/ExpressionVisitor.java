package clean.code.behavioral.visitor.acyclic;

public interface ExpressionVisitor extends Visitor{
    void visit(Expression exp);
}
