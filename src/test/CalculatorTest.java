package test;
import main.Calculator;
import org.junit.jupiter.api.Test;
import static  org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMathcers.*;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testSum(){
        int result = calculator.sum(2,3);
        assertThat(result, is(equalTo(5)));
    }

    @Test
    public void testSubtract(){
        int result = calculator.subtract(3,2);
        assertThat(result, is(equalTo(1)));
    }

    @Test
    public void testMultiply(){
        int result = calculator.multiply(2,5);
        assertThat(result, is(equalTo(10)));
    }

    @Test
    public void testDivide(){
        float result = calculator.divide(20,4);
        assrtThat(result, is(equalTo(5)));
    }
}
