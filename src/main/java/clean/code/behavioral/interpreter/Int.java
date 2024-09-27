package clean.code.behavioral.interpreter;

public class Int implements Element{
    private int value;

    public Int(int value) {
        this.value = value;
    }

    @Override
    public int eval() {
        return value;
    }
}
