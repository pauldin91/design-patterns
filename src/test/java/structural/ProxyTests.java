package structural;

import clean.code.structural.proxy.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;
import java.util.ArrayList;

public class ProxyTests {


    @Test
    public void carProxyTests(){
        Driver driver = new Driver(17);
        Car car = new Car(driver);
        String beepBeepBoop = "Beep beep boop";
        Assertions.assertEquals(car.drive(), beepBeepBoop);
        Car safeCar = new CarProxy(driver);
        String tooYoung = "Too young";
        Assertions.assertEquals(safeCar.drive(), tooYoung);

    }

    @Test
    public void dynamicProxyTests()
    {
        Person person = new Person();
        Human logged = withLogging(person,Human.class);
        System.out.println(logged.talk());
        System.out.println(logged.walk());
        System.out.println(logged.talk());
        System.out.println(logged);

    }
    @SuppressWarnings("unchecked")
    public static <T> T withLogging(T target,Class<T> itf)
    {
        return (T) Proxy.newProxyInstance(itf.getClassLoader(), new Class<?>[]{itf},new LoggingHandler(target));
    }
}
