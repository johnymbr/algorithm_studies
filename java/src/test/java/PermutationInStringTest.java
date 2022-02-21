import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PermutationInStringTest {

    @Test
    public void test1() {
        PermutationInString p = new PermutationInString();
        Assertions.assertTrue(p.checkInclusion("ab", "eidbaooo"));
    }
}
