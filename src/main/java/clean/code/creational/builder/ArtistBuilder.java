package clean.code.creational.builder;

public class ArtistBuilder<SELF extends ArtistBuilder<SELF>> extends EmployeeBuilder<SELF>
{
    public SELF withHobby(String hobby)
    {
        person.hobby=hobby;
        return (SELF) this;
    }

}
