import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
//        Person mosh = new Person("Moshe", "Maizels", "000000001", 34);
//        System.out.println(mosh);

        testLineBreakpoint();
        testFieldBreakpoint();
        testMethodBreakpoint();
        testLoggingBreakpoint();
        testExceptionBreakpoint();
        debugJavaStream();
    }

    private static void testLineBreakpoint() {
        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
        System.out.println("Hello World 3");

    }

    private static void testFieldBreakpoint() {
        System.out.println("Creating new Person instance");
        Person person1 = new Person("Moshe", "Maizels", "000000001", 34);
        System.out.println("Created new Person instance");

        System.out.println("Calling Person.getAge");
        int originalAge = person1.getAge();
        System.out.println("Called Person.getAge");

        System.out.println("Calling Person.getFirstname");
        String firstname = person1.getFirstname();
        System.out.println("Called Person.getFirstname");

        System.out.println("Calling Person.setAge");
        person1.setAge(60);
        System.out.println("Called Person.setAge");

        System.out.println("Calling Person.setFirstname");
        person1.setFirstname("blabla");
        System.out.println("Called Person.setFirstname");
    }

    private static void testMethodBreakpoint() {
        Person p1 = new Person("a", "a","1", 1);
        Person p2 = new Person("b", "b","2", 2);
        Person p3 = new Person("c", "c","3", 3);

        System.out.println(p1.toString());
        p2.getAge();
        System.out.println(p3.getFirstname());
        System.out.println(p3);
    }

    private static void testLoggingBreakpoint() {
        Person p1 = new Person("a", "a","1", 1);
        p1.logBreakpointMethod();
    }
    private static void testExceptionBreakpoint() {
        Person p1 = new Person("a", "a","1", 1);
        p1.setPersonAge(11);
        Person p2 = new Person("b", "b","2", 2);
        p1.setPersonAge(-5);
        System.out.println(p1);
        System.out.println(p2);
    }

    private static void debugJavaStream() {
        List<String> listResult = Stream.of("a", "c", "d", "b")
                .sorted()
                .filter(element -> element.equals("b") || element.equals("d"))
                .collect(Collectors.toList());
        System.out.println(listResult);
    }




}
