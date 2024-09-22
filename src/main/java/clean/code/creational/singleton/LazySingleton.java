package clean.code.creational.singleton;

public class LazySingleton {
    private static LazySingleton lazy = new LazySingleton();

    private LazySingleton() {
        System.out.println("Init");
    }

    public static synchronized LazySingleton getInstance() {
        if (lazy == null) {
            lazy = new LazySingleton();
        }
        return lazy;
    }
    public static LazySingleton getDblInstance()
    {
        if (lazy == null) {
            synchronized(LazySingleton.class)
            {
                if (lazy == null) {
                    lazy = new LazySingleton();
                }
            }
        }
        return lazy;
    }
}
