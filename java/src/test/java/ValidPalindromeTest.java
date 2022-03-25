import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {

    @Test
    public void test1() {
        ValidPalindrome v = new ValidPalindrome();
        Assertions.assertTrue(v.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void test2() {
        ValidPalindrome v = new ValidPalindrome();
        Assertions.assertFalse(v.isPalindrome("race a car"));
    }

    @Test
    public void test3() {
        ValidPalindrome v = new ValidPalindrome();
        Assertions.assertTrue(v.isPalindrome(""));
    }
}
