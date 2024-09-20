package clean.code.creational.builder;

public abstract class  AbstractPersonBuilder
{
    protected Person person;

    public Person build()
    {
        return person;
    }
}
