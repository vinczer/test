import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumTest {

    private Sum sum;

    @BeforeEach
    void setUp() {
        sum = new Sum();
    }

    @Test
    void testCalculateShouldThrowExceptionWhenParametersAreNull() {
        Exception exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> {
                    sum.calculate(null, null);
                }
        );

        String expectedMessage = "Null parameter is illegal!";
        String actualMessage = exception.getMessage();

        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void testCalculateShouldThrowExceptionWhenParametersAreNotValid() {
        Exception exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> {
                    sum.calculate("one", "bad");
                }
        );

        String expectedMessage = "Only int value is accepted!";
        String actualMessage = exception.getMessage();

        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void testCalculateShouldDoAddWhenParametersAreValid() {
        Integer expectedInteger = 8;
        Integer actualInteger = sum.calculate("5", "3");

        Assertions.assertEquals(expectedInteger, actualInteger);
    }
}
