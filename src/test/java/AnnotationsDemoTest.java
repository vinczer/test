import org.junit.jupiter.api.*;

public class AnnotationsDemoTest {

    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Teszt", "Elek");
    }

    @Test
    void test() {
        person.setFirstName("Jobban Teszt");
        System.out.println(person.toString());
    }

    @RepeatedTest(3)
    void testRepeatedThreeTimes() {
        System.out.println(person.toString());
    }

    @Test @DisplayName("Custom name")
    void testWithDisplayNameCustomName() {}

    @Disabled("Disabled until bug 543 has been resolved") @Test
    void testWillBeSkipped() {}

    @Test
    void testToShowBeforeEachBehaviour() {
        person.setFirstName("Jobban Teszt");
        System.out.println(person.toString());
    }

    @Test
    void testToShowBeforeEachAfterBehaviour() {
        System.out.println(person.toString());
    }
}
