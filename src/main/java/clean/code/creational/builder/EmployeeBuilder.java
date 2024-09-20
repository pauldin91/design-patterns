package clean.code.creational.builder;

public class EmployeeBuilder<SELF extends EmployeeBuilder<SELF>> extends PersonBuilder<SELF>
{
    public SELF withPosition(String position)
    {
        person.position = position;
        return (SELF) this;
    }



}
