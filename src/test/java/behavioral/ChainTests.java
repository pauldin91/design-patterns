package behavioral;

import clean.code.behavioral.chainofresponsibility.*;
import clean.code.behavioral.chainofresponsibility.old.Creature;
import clean.code.behavioral.chainofresponsibility.old.CreatureModifier;
import clean.code.behavioral.chainofresponsibility.old.DoubleAttackModifier;
import clean.code.behavioral.chainofresponsibility.old.IncreasedDefenseModifier;
import org.junit.jupiter.api.Test;

public class ChainTests {

   // @Test
    public void creatureChainTests()
    {
        Creature creature = new Creature("srek",10,3);
        CreatureModifier mod = new CreatureModifier(creature);

        mod.add(new DoubleAttackModifier(creature));
        mod.add(new IncreasedDefenseModifier(creature));
        mod.add(new IncreasedDefenseModifier(creature));
        mod.add(new IncreasedDefenseModifier(creature));


        System.out.println(creature);
        mod.handle();
        System.out.println(creature);


    }

    @Test
    public void gameTests(){

        Game game = new Game();
        ECreature goblin = new ECreature(game,"goblin",7,4);
        ECreatureModifier mod = new ECreatureModifier(game,goblin);
        System.out.println(goblin);
        EDoubleAttackModifier da1 = new EDoubleAttackModifier(game,goblin);
        System.out.println(goblin);
        EIncreasedDefenseModifier di = new EIncreasedDefenseModifier(game,goblin);
        System.out.println(goblin);

    }
}
