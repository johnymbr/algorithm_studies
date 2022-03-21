import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PascalsTriangleTest {

    @Test
    public void test1() {
        PascalsTriangle p = new PascalsTriangle();
        List<List<Integer>> ret = p.generate(5);
        Assertions.assertEquals(5, ret.size());
        Assertions.assertEquals(1, ret.get(0).size());
        Assertions.assertEquals(2, ret.get(1).size());
        Assertions.assertEquals(3, ret.get(2).size());
        Assertions.assertEquals(4, ret.get(3).size());
        Assertions.assertEquals(5, ret.get(4).size());
    }
}
