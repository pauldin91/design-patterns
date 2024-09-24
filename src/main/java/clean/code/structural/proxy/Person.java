package clean.code.structural.proxy;

public class Person implements Human {
    @Override
    public String walk() {
        return "Walking";
    }

    @Override
    public String talk() {
        return "Talking";
    }
}
