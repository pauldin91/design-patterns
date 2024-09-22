package clean.code.creational.singleton;

import java.io.File;
import java.io.IOException;

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private StaticBlockSingleton() throws IOException {
        System.out.println("Init");
        File.createTempFile(".",".");
    }
    public static StaticBlockSingleton getInstance(){return instance;}
}
