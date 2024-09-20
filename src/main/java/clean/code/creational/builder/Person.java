package clean.code.creational.builder;

public class Person {
    public String name;
    public String position;
    public String hobby;
    public String address,postCode;
    public int annualIncome;
    @Override
    public String toString()
    {
        return "Person { name='"+name+'\''+", position='"+position+'\''+",hobby='"+hobby+'\''+
                ", address='"+address+'\''+",postCode='"+postCode+'\''+",annualIncome='"+annualIncome+'\''+'}';

    }

}
