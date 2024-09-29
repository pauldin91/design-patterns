package behavioral;

import clean.code.behavioral.template.Chess;
import clean.code.behavioral.template.Game;
import org.junit.jupiter.api.Test;

public class TemplateTests {

    @Test
    public void chessTests() {
        Game chess=new Chess();
        chess.run();
    }
}
