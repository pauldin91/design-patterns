package clean.code.behavioral.observer;

public class Human {
    public Event<ChangedEventArgs> propertyChanged= new Event<>();
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(this.age==age) return;
        this.age = age;
        propertyChanged.fire(new ChangedEventArgs(this,"age"));
    }

    public String getName() {
        return name;
    }
}
