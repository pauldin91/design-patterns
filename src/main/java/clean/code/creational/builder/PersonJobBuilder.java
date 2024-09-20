package clean.code.creational.builder;

public class PersonJobBuilder extends FacadePersonBuilder
{

    public PersonJobBuilder(Person person){this.person=person;}
    public PersonJobBuilder works(String position)
    {
        person.position = position;
        return this;
    }

    public PersonJobBuilder earns(int income)
    {
        person.annualIncome = income;

        return this;
    }
}
