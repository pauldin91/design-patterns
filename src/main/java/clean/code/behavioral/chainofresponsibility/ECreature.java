package clean.code.behavioral.chainofresponsibility;

public class ECreature {
    private Game game;
    private String creatureName;
    private int baseAttack, baseDefense;

    public ECreature(Game game, String creatureName, int attack, int defense) {
        this.game = game;
        this.creatureName = creatureName;
        this.baseAttack = attack;
        this.baseDefense = defense;
    }
    public String getCreatureName(){return creatureName;}
    int getAttack()
    {
        Query q=new Query(creatureName, Query.Argument.ATTACK,baseAttack);
        game.queries.fire(q);
        return q.getResult();

    }
    int getDefense()
    {
        Query q=new Query(creatureName, Query.Argument.DEFENSE,baseDefense);
        game.queries.fire(q);
        return q.getResult();

    }

    @Override
    public String toString() {
        return "{name="+creatureName+", attack="+ getAttack()+", defense="+ getDefense()+"}";
    }

}
