package clean.code.structural.proxy;

public class Car implements Drivable{
    protected Driver driver;

    public Car(Driver driver) {
        this.driver = driver;
    }
    @Override
    public String drive() {
        return "Beep beep boop";
    }
}
