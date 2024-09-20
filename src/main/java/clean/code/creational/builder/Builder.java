package clean.code.creational.builder;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Builder<T>
{
    protected Class<T> type;
    protected T theOne;
    public Builder(Class<T> type) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        this.type= type;
        theOne = getInstance();

    }
    public <K>  Builder<T> setProperty (String fieldName,K fieldValue) throws NoSuchFieldException, IllegalAccessException {
        Field field = type.getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(theOne, fieldValue);
        return this;
    }

    private T getInstance()
            throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException
    {
        return type.getDeclaredConstructor().newInstance();
    }
    public  T build()
    {
        return theOne;
    }

}
