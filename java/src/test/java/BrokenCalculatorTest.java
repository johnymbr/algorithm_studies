import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BrokenCalculatorTest {

    @Test
    public void test1() {
        BrokenCalculator b = new BrokenCalculator();
        Assertions.assertEquals(2, b.brokenCalc(2, 3));
    }

    @Test
    public void test2() {
        BrokenCalculator b = new BrokenCalculator();
        Assertions.assertEquals(2, b.brokenCalc(5, 8));
    }

    @Test
    public void test3() {
        BrokenCalculator b = new BrokenCalculator();
        Assertions.assertEquals(3, b.brokenCalc(3, 10));
    }
}
