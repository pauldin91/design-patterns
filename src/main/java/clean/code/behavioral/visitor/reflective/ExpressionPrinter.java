package clean.code.behavioral.visitor.reflective;

public class ExpressionPrinter {
    public static void print(Expression e, StringBuilder sb)
    {
        if(e.getClass()==DoubleExpression.class)
        {
            sb.append(((DoubleExpression)e).getValue());
        }
        else if(e.getClass()==AdditionExpression.class)
        {
            AdditionExpression ae = (AdditionExpression)e;
            sb.append("(");
            print(ae.getLhs(),sb);
            sb.append("+");
            print(ae.getRhs(),sb);
            sb.append(")");
        }
    }
}
