package clean.code.behavioral.observer;

public class PersonAgeWatcher implements Observer<Person> {


    @Override
    public void handle(PropertyChangedEventArgs<Person> args) {
        System.out.println(args.source.getName()+"'s" + args.propertyName + " has changed to " + args.newValue);
    }
}
