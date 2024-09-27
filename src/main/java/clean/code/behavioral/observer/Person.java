package clean.code.behavioral.observer;

public class Person extends Observable<Person>{
    private int age;
    private String name;
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(this.age==age) return;
        this.age = age;
        propertyChanged(this,"age",age);
    }

    public String getName() {
        return name;
    }
}
