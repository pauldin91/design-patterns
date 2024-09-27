package clean.code.behavioral.interpreter;

public class Token {
    public Type type;
    private String text;

    public Token(Type type, String text) {
        this.type = type;
        this.text = text;
    }
    @Override
    public String toString() {
        return "`"+text+"`";
    }
}
