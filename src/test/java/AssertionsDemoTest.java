import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AssertionsDemoTest {

    private Person person;
    private List<Person> personList;

    @BeforeEach
    void setUp() {
        person = new Person("Teszt", "Elek");
        personList = Arrays.asList(
                new Person("Egyik", "Elek"),
                new Person("Masik", "Elek")
        );
    }

    @Test
    void standardAssertions() {
        Assertions.assertEquals(2, 2);
        Assertions.assertNotEquals(2, 4);
    }

    @Test
    void standardAssertTrueOrAssertFalse() {
        Assertions.assertTrue('a' < 'b');
        Assertions.assertFalse('a' > 'b');
    }

    @Test
    void groupedAssertions() {
        Assertions.assertAll("personAssert",
                () -> Assertions.assertEquals("Teszt", person.getFirstName()),
                () -> Assertions.assertEquals("Elek", person.getLastName())
        );
    }

    @Test
    void iteterableAssertions() {
        Assertions.assertNotNull(personList);
        Assertions.assertIterableEquals(personList, personList);
    }
}
