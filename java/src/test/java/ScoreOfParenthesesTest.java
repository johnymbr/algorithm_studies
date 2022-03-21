import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScoreOfParenthesesTest {

    @Test
    public void test1() {
        ScoreOfParentheses s = new ScoreOfParentheses();
        Assertions.assertEquals(3, s.scoreOfParentheses("(()(()))"));
    }
}
