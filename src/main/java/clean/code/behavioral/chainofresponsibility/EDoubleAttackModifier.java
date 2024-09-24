package clean.code.behavioral.chainofresponsibility;

public class EDoubleAttackModifier extends ECreatureModifier implements AutoCloseable{

    private final int token;
    public EDoubleAttackModifier(Game game, ECreature creature) {
        super(game, creature);
        token = game.queries.subscribe(s-> {
            if(s.getCreatureName().equals(creature.getCreatureName()) && s.getArgument() == Query.Argument.ATTACK)
            {
                s.setResult(2*s.getResult());
            }
        });
    }

    @Override
    public void close()
    {
        game.queries.unsubscribe(token);
    }
}
