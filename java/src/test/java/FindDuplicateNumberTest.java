import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindDuplicateNumberTest {

    @Test
    public void test1() {
        FindDuplicateNumber f = new FindDuplicateNumber();
        Assertions.assertEquals(3, f.findDuplicate(new int[]{3, 1, 3, 4, 2}));
    }
}
