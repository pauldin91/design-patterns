package behavioral;

import clean.code.behavioral.observer.*;
import org.junit.jupiter.api.Test;

public class ObserverTests {

    @Test
    public void personAgeTests()
    {
        Observer<Person> obs = new PersonAgeWatcher();
        Person p = new Person(20,"me");
        p.subscribe(obs);
        p.setAge(23);
        p.setAge(27);
        p.setAge(23);

    }

    @Test
    public void humanAgeTests()
    {
        Human p = new Human("me",20);
        Event<clean.code.behavioral.observer.ChangedEventArgs>.Subscription subscription = p.propertyChanged.addHandler(x -> {
            System.out.println(p.getName() + "'s age has changed to " + p.getAge());
        });
        p.setAge(23);
        p.setAge(27);
        subscription
                .close();
        p.setAge(23);


    }
}
