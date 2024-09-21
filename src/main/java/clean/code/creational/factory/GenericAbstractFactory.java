package clean.code.creational.factory;

import java.util.Map;

public class GenericAbstractFactory {


    public <K> K create(Map<String, Object> properties, Class<K> cls) throws Exception {

        Factory factory = new Factory();

        return factory.create(properties, cls);
    }
}
