package clean.code.creational.builder;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class PersonBuilder<SELF extends PersonBuilder<SELF>> extends AbstractPersonBuilder
{
    public SELF withName(String name)
    {
        person.name = name;
        return self();
    }
    protected SELF self()
    {
        return (SELF) this;
    }

}
