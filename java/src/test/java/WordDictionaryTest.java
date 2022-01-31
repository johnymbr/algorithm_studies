import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordDictionaryTest {

    @Test
    public void test1() {
        WordDictionary wd = new WordDictionary();
        wd.addWord("bad");

        Assertions.assertEquals(1, wd.letters.size());
    }

    @Test
    public void test2() {
        WordDictionary wd = new WordDictionary();
        wd.addWord("bad");
        wd.addWord("dad");
        wd.addWord("mad");

        Assertions.assertEquals(3, wd.letters.size());
        Assertions.assertFalse(wd.search("pad"));
        Assertions.assertTrue(wd.search("bad"));
        Assertions.assertTrue(wd.search(".ad"));
        Assertions.assertTrue(wd.search("b.."));
        Assertions.assertFalse(wd.search(".e"));
    }
}
