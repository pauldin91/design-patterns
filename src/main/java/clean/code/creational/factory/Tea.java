package clean.code.creational.factory;

public class Tea implements HotDrink {
    public int waterMls;
    public int grams;

    public Tea(int waterMls, int grams) {

        this.waterMls = waterMls;
        this.grams = grams;
    }

    @Override
    public void Consume() {
        System.out.println("Mmm tea");
    }
}
