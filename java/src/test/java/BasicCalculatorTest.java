import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicCalculatorTest {

    @Test
    public void test1() {
        BasicCalculator calculator = new BasicCalculator();
        Assertions.assertEquals(2, calculator.calculate("1 + 1"));
    }

    @Test
    public void test2() {
        BasicCalculator calculator = new BasicCalculator();
        Assertions.assertEquals(3, calculator.calculate(" 2-1 + 2"));
    }

    @Test
    public void test3() {
        BasicCalculator calculator = new BasicCalculator();
        Assertions.assertEquals(23, calculator.calculate("(1+(4+5+2)-3)+(6+8)"));
    }
}
