import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {

    @Test
    public void test1() {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        Assertions.assertEquals("fl", lcp.longestCommonPrefixV2(new String[]{"flower", "flow", "flight"}));
        Assertions.assertEquals("", lcp.longestCommonPrefixV2(new String[]{"dog", "racecar", "car"}));
        Assertions.assertEquals("c", lcp.longestCommonPrefixV2(new String[]{"cir", "car"}));
    }
}
