package clean.code.behavioral.interpreter;

public class BinaryOperation implements Element {
    public Type type;
    public Element left, right;

    @Override
    public int eval() {
        switch (type) {
            case ADDITION:
                return left.eval() + right.eval();
            case SUBTRACTION:
                return left.eval() - right.eval();
            default:
                return 0;
        }
    }

    public enum Type {
        ADDITION, SUBTRACTION
    }
}
