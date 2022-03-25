import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmallestStringTest {

    @Test
    public void test1() {
        SmallestString s = new SmallestString();
        Assertions.assertEquals("aay", s.getSmallestString(3, 27));
    }

    @Test
    public void test2() {
        SmallestString s = new SmallestString();
        Assertions.assertEquals("aaszz", s.getSmallestString(5, 73));
    }
}
