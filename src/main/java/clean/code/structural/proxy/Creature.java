package clean.code.structural.proxy;

public class Creature {
    private Property<Integer> agility=new Property<>(10);
    public void setAgility(int value)
    {
        agility.setValue(value);
    }
    public int getAgility()
    {
        return agility.getValue();
    }
}
