package builder;

import clean.code.creational.builder.FacadePersonBuilder;
import clean.code.creational.builder.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FacadedBuilderTests {
    @Test
    public void facadeBuilder()
    {
        Person person = new FacadePersonBuilder()
                .at().lives("Saloniki").postCode("55133")
                .info().name("Tade")
                .job().works("Somewhere").earns(100000)
                .build();
        Assertions.assertEquals(person.annualIncome,100000);
        Assertions.assertEquals(person.position,"Somewhere");
        Assertions.assertEquals(person.name,"Tade");
        Assertions.assertEquals(person.address,"Saloniki");
        Assertions.assertEquals(person.postCode,"55133");
    }


}
