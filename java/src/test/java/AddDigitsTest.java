import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddDigitsTest {

    @Test
    public void test1() {
        AddDigits a = new AddDigits();
        Assertions.assertEquals(2, a.addDigits(38));
    }

    @Test
    public void test2() {
        AddDigits a = new AddDigits();
        Assertions.assertEquals(0, a.addDigits(0));
    }

    @Test
    public void test3() {
        AddDigits a = new AddDigits();
        Assertions.assertEquals(8, a.addDigits(125));
    }
}
