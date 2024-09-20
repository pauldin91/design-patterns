package clean.code.creational.builder;

public class PersonAddressBuilder extends FacadePersonBuilder
{
    public PersonAddressBuilder(Person person){this.person=person;}


    public PersonAddressBuilder lives(String address)
    {
        person.address = address;
        return this;
    }
    public PersonAddressBuilder postCode(String postCode)
    {
        person.postCode = postCode;
        return this;
    }
}
