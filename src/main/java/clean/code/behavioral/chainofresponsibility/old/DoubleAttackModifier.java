package clean.code.behavioral.chainofresponsibility.old;

public class DoubleAttackModifier extends CreatureModifier {

    public DoubleAttackModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handle()
    {
        System.out.println("Double attack");
        creature.setAttack(creature.getAttack()*2);
        super.handle();
    }
}
