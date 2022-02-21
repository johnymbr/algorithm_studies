import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubarraySumEqualsKTest {

    @Test
    public void test1() {
        SubarraySumEqualsK s = new SubarraySumEqualsK();
        Assertions.assertEquals(2, s.subarraySum(new int[]{1,1,1}, 2));
    }

    @Test
    public void test2() {
        SubarraySumEqualsK s = new SubarraySumEqualsK();
        Assertions.assertEquals(3, s.subarraySum(new int[]{1,1,1}, 1));
    }

    @Test
    public void test3() {
        SubarraySumEqualsK s = new SubarraySumEqualsK();
        Assertions.assertEquals(2, s.subarraySum(new int[]{1,2,3}, 3));
    }

    @Test
    public void test4() {
        SubarraySumEqualsK s = new SubarraySumEqualsK();
        Assertions.assertEquals(0, s.subarraySum(new int[]{1}, 0));
    }

    @Test
    public void test5() {
        SubarraySumEqualsK s = new SubarraySumEqualsK();
        Assertions.assertEquals(1, s.subarraySum(new int[]{-1,-1,1}, 0));
    }
}
