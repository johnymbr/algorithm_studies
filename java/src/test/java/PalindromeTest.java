import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    public void test1() {
        Palindrome p = new Palindrome();
        Assertions.assertTrue(p.isPalindrome(121));
    }

    @Test
    public void test2() {
        Palindrome p = new Palindrome();
        Assertions.assertFalse(p.isPalindrome(-121));
    }

    @Test
    public void test3() {
        Palindrome p = new Palindrome();
        Assertions.assertFalse(p.isPalindrome(1245));
    }
}
