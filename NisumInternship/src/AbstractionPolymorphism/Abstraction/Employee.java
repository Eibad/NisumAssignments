package AbstractionPolymorphism.Abstraction;

public class Employee extends Person {

    private String name;
    private String age;

    public Employee(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    String getAge() {
        return age;
    }

    @Override
    void setAge(String age) {
        this.age = age;
    }

    @Override
    void setName(String name) {
        this.name = name;
    }
}
