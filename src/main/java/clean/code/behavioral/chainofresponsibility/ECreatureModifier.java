package clean.code.behavioral.chainofresponsibility;

public class ECreatureModifier {
    protected Game game;
    protected ECreature creature;

    public ECreatureModifier(Game game,ECreature creature) {
        this.game = game;
        this.creature = creature;
    }

}
