package creational;

import clean.code.creational.singleton.BasicSingleton;
import clean.code.creational.singleton.Saver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTests {

    @Test
    public void tests() {
        BasicSingleton single = BasicSingleton.getInstance();
        single.setValue(190);
        BasicSingleton doubl = BasicSingleton.getInstance();
        Assertions.assertEquals(doubl.getValue(), single.getValue());
        doubl.setValue(920);
        Assertions.assertEquals(doubl.getValue(), single.getValue());
    }

    @Test
    public void serializableTests() {
        BasicSingleton single = BasicSingleton.getInstance();
        single.setValue(190);
        String filename = "singleton.bin";
        Saver saver = new Saver();
        try {
            saver.saveTo(filename, single);
            single.setValue(200);
            BasicSingleton doubl = saver.readFrom(filename);
            Assertions.assertEquals(single.getValue(), doubl.getValue());
        } catch (Exception e) {

        }
    }
}
