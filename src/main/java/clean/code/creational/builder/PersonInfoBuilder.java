package clean.code.creational.builder;

public class PersonInfoBuilder extends FacadePersonBuilder
{
    public PersonInfoBuilder(Person person){this.person=person;}


    public PersonInfoBuilder name(String name)
    {
        person.name = name;
        return this;
    }
}
