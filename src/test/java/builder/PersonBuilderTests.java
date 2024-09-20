package builder;

import clean.code.creational.builder.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonBuilderTests {

    @Test
    public void personBuilderTest()
    {
        try
        {
            Person person = new Builder<>(Person.class)
                    .setProperty("name","Tade")
                    .setProperty("position","SWE")
                    .setProperty("hobby","Paint")
                    .build();

            Assertions.assertEquals(person.name,"Tade");
            Assertions.assertEquals(person.position,"SWE");
            Assertions.assertEquals(person.hobby,"Paint");

        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


}
