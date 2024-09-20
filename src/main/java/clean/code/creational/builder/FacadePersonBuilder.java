package clean.code.creational.builder;

public class FacadePersonBuilder {
    protected Person person= new Person();

    public PersonJobBuilder job()
    {
        return new PersonJobBuilder(person);
    }
    public PersonInfoBuilder info()
    {
        return new PersonInfoBuilder(person);
    }
    public PersonAddressBuilder lives()
    {
        return new PersonAddressBuilder(person);
    }
    public PersonAddressBuilder at()
    {
        return new PersonAddressBuilder(person);
    }

    public Person build()
    {
        return person;
    }
}
