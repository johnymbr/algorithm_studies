import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeBuySellTest {

    @Test
    public void test1() {
        BestTimeBuySell b = new BestTimeBuySell();
        Assertions.assertEquals(5, b.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
