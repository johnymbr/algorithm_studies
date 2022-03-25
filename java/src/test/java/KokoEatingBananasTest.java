import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KokoEatingBananasTest {

    @Test
    public void test1() {
        KokoEatingBananas k = new KokoEatingBananas();
        Assertions.assertEquals(4, k.minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
    }
}
