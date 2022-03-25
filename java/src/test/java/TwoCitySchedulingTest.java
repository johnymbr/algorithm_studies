import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoCitySchedulingTest {

    @Test
    public void test1() {
        TwoCityScheduling t = new TwoCityScheduling();
        Assertions.assertEquals(110, t.twoCitySchedCost(new int[][]{{10, 20}, {30, 200}, {400, 50}, {30, 20}}));
    }
}
