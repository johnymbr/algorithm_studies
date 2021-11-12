import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanToIntegerTest {

    @Test
    public void test1() {
        RomanToInteger rti = new RomanToInteger();
        Assertions.assertEquals(3, rti.romanToInt("III"));
        Assertions.assertEquals(4, rti.romanToInt("IV"));
        Assertions.assertEquals(1994, rti.romanToInt("MCMXCIV"));
    }
}
