package clean.code.behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Parser {
    public List<Token> lex(String input) {
        ArrayList<Token> result = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i))
            {
                case '+' -> result.add(new Token(Type.PLUS, "+"));
                case '-' -> result.add(new Token(Type.MINUS, "-"));
                case '*' -> result.add(new Token(Type.AST, "*"));
                case '/' -> result.add(new Token(Type.DIV, "/"));
                case '(' -> result.add(new Token(Type.LPAR, "("));
                case ')' -> result.add(new Token(Type.RPAR, ")"));
                default -> {
                    StringBuilder sb = new StringBuilder("" + input.charAt(i));
                    for (int j = i + 1; j < input.length(); ++j) {
                        if (Character.isDigit(input.charAt(j))) {
                            sb.append(input.charAt(j));
                            ++i;
                        } else {
                            break;
                        }
                    }
                    result.add(new Token(Type.INTEGER, sb.toString()));
                }
            }
        }
        return result;
    }

    public Element parse(List<Token> tokens)
    {
        BinaryOperation result = new BinaryOperation();
        boolean haveLHS = false;
        for (int i = 0; i < tokens.size(); i++) {
            Token token = tokens.get(i);
            switch (token.type){
                case INTEGER:
                    Int integer = new Int(Integer.parseInt(token.toString()));
                    if(!haveLHS)
                    {
                        result.left = integer;
                        haveLHS = true;
                    }else
                    {
                        result.right=integer;
                    }
                    break;
                case PLUS:
                    result.type = BinaryOperation.Type.ADDITION;
                    break;
                case MINUS:
                    result.type = BinaryOperation.Type.SUBTRACTION;
                    break;

                case LPAR:
                    int j=0;
                    for (; j < tokens.size(); ++j) {
                        if(tokens.get(j).type == Type.RPAR)
                            break;
                    }
                    List<Token> subexpression = tokens.stream()
                            .skip(i + 1)
                            .limit(j - i - 1)
                            .collect(Collectors.toList());
                    Element element = parse(subexpression);
                    if(!haveLHS)
                    {
                        result.left = element;
                        haveLHS = true;
                    }else
                    {
                        result.right = element;
                    }
                    i = j;
                    break;

            }
        }
        return result;
    }
}
