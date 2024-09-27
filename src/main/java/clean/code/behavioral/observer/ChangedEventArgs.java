package clean.code.behavioral.observer;

public class ChangedEventArgs {
    public Object source;
    public String propertyName;

    public ChangedEventArgs(Object source,String propertyName) {
        this.source = source;
        this.propertyName = propertyName;
    }
}
