import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleNumberTest {

    @Test
    public void test1() {
        SingleNumber s = new SingleNumber();
        Assertions.assertEquals(1, s.singleNumber(new int[]{2, 2, 1}));
    }

    @Test
    public void test2() {
        SingleNumber s = new SingleNumber();
        Assertions.assertEquals(4, s.singleNumber(new int[]{4,1,2,1,2}));
    }
}
