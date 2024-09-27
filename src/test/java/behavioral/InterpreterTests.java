package behavioral;

import clean.code.behavioral.interpreter.Element;
import clean.code.behavioral.interpreter.Parser;
import clean.code.behavioral.interpreter.Token;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;


public class InterpreterTests {
    @Test
    public void interpreterTests()
    {
        String text = "(12*4)+2";
        Parser p= new Parser();
        List<Token> list = p.lex(text);
        //System.out.println(list.stream().map(t->t.toString()).collect(Collectors.joining("\t")));
        //Element parsed = p.parse(list);
        //System.out.println(text + "="+parsed.eval());
    }


}
