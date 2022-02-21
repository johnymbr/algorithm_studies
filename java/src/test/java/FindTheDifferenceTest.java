import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindTheDifferenceTest {

    @Test
    public void test1() {
        FindTheDifference f = new FindTheDifference();
        Assertions.assertEquals('e', f.findTheDifference("abcd", "abcde"));
    }

    @Test
    public void test2() {
        FindTheDifference f = new FindTheDifference();
        Assertions.assertEquals('e', f.findTheDifferenceXOR("abcd", "abcde"));
        Assertions.assertEquals('x', f.findTheDifferenceXOR("abcd", "baxcd"));
    }
}
