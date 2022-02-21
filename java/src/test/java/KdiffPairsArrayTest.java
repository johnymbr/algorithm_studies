import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KdiffPairsArrayTest {

    @Test
    public void test1() {
        KdiffPairsArray k = new KdiffPairsArray();
        Assertions.assertEquals(2, k.findPairs(new int[]{3, 1, 4, 1, 5}, 2));
        Assertions.assertEquals(4, k.findPairs(new int[]{1, 2, 3, 4, 5}, 1));
    }

    @Test
    public void test2() {
        KdiffPairsArray k = new KdiffPairsArray();
        Assertions.assertEquals(1, k.findPairs(new int[]{1, 3, 1, 5, 4}, 0));
    }

    @Test
    public void test3() {
        KdiffPairsArray k = new KdiffPairsArray();
        Assertions.assertEquals(3, k.findPairs(new int[]{6, 2, 9, 3, 9, 6, 7, 7, 6, 4}, 3));
    }
}
