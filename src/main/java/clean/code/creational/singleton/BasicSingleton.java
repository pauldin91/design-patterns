package clean.code.creational.singleton;

import java.io.Serializable;

public class BasicSingleton implements Serializable {

    private BasicSingleton(){}
    private static final BasicSingleton instance =new BasicSingleton();
    public static BasicSingleton getInstance(){
        return instance;
    }
    private int value = 0;

    public int getValue() {
        return value;
    }
    protected Object readResolve()
    {
        return instance;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
