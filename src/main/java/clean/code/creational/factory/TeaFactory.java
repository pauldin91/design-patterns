package clean.code.creational.factory;

public class TeaFactory implements HotDrinkFactory {

    @Override
    public HotDrink Prepare() {
        System.out.println("1.Boil water\n2. Tea bag into hot water\n3.Serve in cup");
        return new Tea(220,4);
    }
}
