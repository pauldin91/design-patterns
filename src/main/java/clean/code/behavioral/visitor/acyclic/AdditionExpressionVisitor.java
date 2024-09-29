package clean.code.behavioral.visitor.acyclic;


public interface AdditionExpressionVisitor extends Visitor{
    void visit(AdditionExpression ae);
}
