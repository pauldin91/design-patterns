package clean.code.behavioral.chainofresponsibility;

public class EIncreasedDefenseModifier extends ECreatureModifier {

    private final int token;
    public EIncreasedDefenseModifier(Game game, ECreature creature) {
        super(game, creature);
        token = game.queries.subscribe(s-> {
            if(s.getCreatureName().equals(creature.getCreatureName()) && s.getArgument() == Query.Argument.DEFENSE)
            {
                s.setResult(3+s.getResult());
            }
        });
    }


}
