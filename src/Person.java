import java.util.Objects;

public class Person {
    private String firstname;
    private String lastname;
    private String id;
    private int age;

    public Person(String firstname, String lastname, String id, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                firstname.equals(person.firstname) &&
                lastname.equals(person.lastname) &&
                id.equals(person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, id, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }

    public void logBreakpointMethod() {
        String purpose_of_this_method = "purpose of this method";
        System.out.println(purpose_of_this_method);
        purpose_of_this_method += " to show no need in println methods";
        System.out.println(purpose_of_this_method);
        purpose_of_this_method += " just use logging breakpoint";
        System.out.println(purpose_of_this_method);
        purpose_of_this_method += " that's all";
        int a = 3+2;
        System.out.println(purpose_of_this_method);
    }


    public void setPersonAge(int newAge) {
        if (newAge < 0) {
            throw new IllegalArgumentException("negative age is not valid");
        }
        setAge(newAge);
    }
}
