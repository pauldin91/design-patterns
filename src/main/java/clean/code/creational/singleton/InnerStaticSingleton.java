package clean.code.creational.singleton;

//thread safety with no synchronization
public class InnerStaticSingleton {

    private InnerStaticSingleton(){}


    private static class Impl
    {
        private static final InnerStaticSingleton instance = new InnerStaticSingleton();
    }
    public InnerStaticSingleton getInstance()
    {
        return Impl.instance;
    }
}
