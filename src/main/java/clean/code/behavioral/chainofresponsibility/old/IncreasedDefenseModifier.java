package clean.code.behavioral.chainofresponsibility.old;

public class IncreasedDefenseModifier extends CreatureModifier {
    public IncreasedDefenseModifier(Creature creature) {
        super(creature);
    }
    @Override
    public void handle()
    {
        System.out.println("gaining defense");
        creature.setDefense(creature.getDefense()+3);
        super.handle();
    }
}
