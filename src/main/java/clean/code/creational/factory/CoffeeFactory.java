package clean.code.creational.factory;

public class CoffeeFactory implements HotDrinkFactory{
    @Override
    public HotDrink Prepare() {
        System.out.println("1.Add coffee into machine\n2. Press start\n3.Serve in cup");
        return new Coffee(200,2);
    }
}
