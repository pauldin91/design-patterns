package clean.code.structural.proxy;

public class CarProxy extends Car{

    public CarProxy(Driver driver) {
        super(driver);
    }

    @Override
    public String drive()
    {
        if (driver.getAge() >=18) {
            return super.drive();
        }
        else
        {
            return "Too young";
        }
    }
}
