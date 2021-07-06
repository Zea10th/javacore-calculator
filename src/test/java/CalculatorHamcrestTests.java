import calculator.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CalculatorHamcrestTests {
    @Test
    void shouldReturnMultOfThreeAndFive() {
        Calculator calculator = Calculator.instance.get();

        int expected = 3 * 5;

        int actual = calculator.multiply.apply(3, 5);

        assertThat(expected, equalTo(actual));
    }

    @ParameterizedTest
    @ValueSource(ints = {-3, -5, 7})
    public void shouldReturnAbs(int argument) {
        Calculator calculator = Calculator.instance.get();

        int expected = Math.abs(argument);

        int actual = calculator.abs.apply(argument);

        assertThat(expected, equalTo(actual));
    }

}
