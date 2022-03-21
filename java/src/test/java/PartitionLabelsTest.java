import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PartitionLabelsTest {

    @Test
    public void test1() {
        PartitionLabels p = new PartitionLabels();
        List<Integer> ret = p.partitionLabels("ababcbacadefegdehijhklij");

        Assertions.assertEquals(3, ret.size());
    }

    @Test
    public void test2() {
        PartitionLabels p = new PartitionLabels();
        List<Integer> ret = p.partitionLabels("eccbbbbdec");

        Assertions.assertEquals(1, ret.size());
    }
}
