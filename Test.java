package dataStructureAlgorithm;

import java.io.Serializable;

public class Test implements Serializable {

    int age;
    String name;
    transient int year;
    static String className;

    public Test(int age, String name ) {
        this.age = age;
        this.name = name;
    }

    public Test(int age, String name, int year,String className) {
        this.age = age;
        this.name = name;
        this.year = year;
        Test.className = className;
    }

    @Override
    public String toString() {
        return "age: " + age + " - name: " + name + " - year: " + year + " - class name: " + className;
    }
}
