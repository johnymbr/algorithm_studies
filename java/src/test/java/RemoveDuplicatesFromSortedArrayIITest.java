import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedArrayIITest {

    @Test
    public void test1() {
        RemoveDuplicatesFromSortedArrayII r = new RemoveDuplicatesFromSortedArrayII();

        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int[] expected = new int[]{1, 1, 2, 2, 3};

        int k = r.removeDuplicates(nums);
        Assertions.assertEquals(5, k);
        for (int i = 0; i < k; i++) {
            Assertions.assertEquals(expected[i], nums[i]);
        }
    }

    @Test
    public void test2() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        int[] expected = new int[]{0, 0, 1, 1, 2, 3, 3};

        RemoveDuplicatesFromSortedArrayII r = new RemoveDuplicatesFromSortedArrayII();
        int k = r.removeDuplicates(nums);
        Assertions.assertEquals(7, k);
        for (int i = 0; i < k; i++) {
            Assertions.assertEquals(expected[i], nums[i]);
        }
    }
}
