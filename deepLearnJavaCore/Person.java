package dataStructureAlgorithm.deepLearnJavaCore;

public abstract class Person implements MyInterface {
    private String name;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("I am a person");
    }

    private void hiddenMethod() {
        System.out.println("This is a hidden method");
    }
}
