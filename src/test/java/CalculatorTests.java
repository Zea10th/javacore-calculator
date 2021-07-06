import calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTests {
    @Test
    void shouldReturnFive() {
        Calculator calculator = Calculator.instance.get();

        int expected = 5;

        int actual = calculator.plus.apply(3, 2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnThree() {
        Calculator calculator = Calculator.instance.get();

        int expected = 3;

        int actual = calculator.minus.apply(5, 2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldThrowArithmeticException() {
        Calculator calculator = Calculator.instance.get();

        Assertions.assertThrows(ArithmeticException.class, () -> calculator.devide.apply(10, 0));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 6, 7, 8})
    void souldReturnPoweredAnswers(int argument) {
        Calculator calculator = Calculator.instance.get();

        int expected = argument * argument;

        int actual = calculator.pow.apply(argument);

        Assertions.assertEquals(actual, expected);
    }
}
