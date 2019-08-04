package lab10.asd;

import java.util.Objects;

public class Person {
    private String Id;
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(Id, person.Id) &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name);
    }

    public Person(String id, String name) {
        Id = id;
        this.name = name;
    }
}
