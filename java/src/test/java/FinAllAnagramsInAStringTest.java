import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinAllAnagramsInAStringTest {

    @Test
    public void test1() {
        FindAllAnagramsInAString f = new FindAllAnagramsInAString();
        Assertions.assertEquals(2, f.findAnagrams("cbaebabacd", "abc").size());
    }
}
