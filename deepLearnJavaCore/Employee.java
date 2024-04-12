package dataStructureAlgorithm.deepLearnJavaCore;

public abstract class Employee extends Person{
    public Employee() {

    }

    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void print() {
        System.out.println("I am an employee");
    }
}
