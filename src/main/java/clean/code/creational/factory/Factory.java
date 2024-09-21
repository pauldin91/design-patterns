package clean.code.creational.factory;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Map;

public class Factory{
    public <S> S create(Map<String,Object> properties,Class<S> cls) throws Exception {

        S instance = cls.getDeclaredConstructor().newInstance();
        for(Map.Entry<String,Object> prop : properties.entrySet())
        {
            Field field = cls.getDeclaredField(prop.getKey());
            field.setAccessible(true);
            field.set(instance,prop.getValue());
        }
        return instance;
    }
}
