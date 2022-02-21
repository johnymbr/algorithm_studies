import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContiguousArrayTest {

    @Test
    public void test1() {
        ContiguousArray ca = new ContiguousArray();
        Assertions.assertEquals(6, ca.findMaxLength(new int[]{0,1,0,0,1,1,0}));
    }
}
