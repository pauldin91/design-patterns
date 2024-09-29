package behavioral;

import clean.code.behavioral.visitor.acyclic.AdditionExpression;
import clean.code.behavioral.visitor.acyclic.DoubleExpression;
import clean.code.behavioral.visitor.acyclic.ExpressionCalculator;
import clean.code.behavioral.visitor.acyclic.ExpressionPrinter;
import org.junit.jupiter.api.Test;

public class VisitorTests{

    /*
        @Test
        public void visitorTests()
        {
            AdditionExpression e  = new AdditionExpression(new DoubleExpression(2),
                    new AdditionExpression(new DoubleExpression(3),new DoubleExpression(4)));
            ExpressionPrinter ex = new ExpressionPrinter();
            ex.visit(e);
            System.out.println(ex);

            ExpressionCalculator c = new ExpressionCalculator();
            c.visit(e);
            System.out.println(c);
        }
        */

    @Test
    public void visitorTests()
    {
        AdditionExpression e  = new AdditionExpression(new DoubleExpression(2),
                new AdditionExpression(new DoubleExpression(3),new DoubleExpression(4)));
        ExpressionPrinter ex = new ExpressionPrinter();
        ex.visit(e);
        System.out.println(ex);

        ExpressionCalculator c = new ExpressionCalculator();
        c.visit(e);
        System.out.println(c);
    }

}
