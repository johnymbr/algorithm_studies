import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {

    @Test
    public void test1() {
        ValidParentheses vp = new ValidParentheses();
        Assertions.assertTrue(vp.isValid("()"));
    }

    @Test
    public void test2() {
        ValidParentheses vp = new ValidParentheses();
        Assertions.assertTrue(vp.isValid("()[]{}"));
    }

    @Test
    public void test3() {
        ValidParentheses vp = new ValidParentheses();
        Assertions.assertFalse(vp.isValid("(}"));
    }
}
