package clean.code.creational.factory;

public class Coffee implements HotDrink{
    public int waterMls;
    public int spoons;
    public Coffee(int waterMls,int spoons)
    {
        this.waterMls= waterMls;
        this.spoons = spoons;
    }
    @Override
    public void Consume() {
        System.out.println("Mmm coffee");
    }
}
