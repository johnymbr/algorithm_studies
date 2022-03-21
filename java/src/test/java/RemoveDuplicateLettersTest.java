import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicateLettersTest {

    @Test
    public void test1() {
        RemoveDuplicateLetters r = new RemoveDuplicateLetters();
        Assertions.assertEquals("acdb", r.removeDuplicateLetters("cbacdcbc"));
    }
}
