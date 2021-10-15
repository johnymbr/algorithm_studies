import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyIntArrayListTest {

    @Test
    void testAdd() {
        MyIntArrayList myIntArrayList = new MyIntArrayList();
        myIntArrayList.add(1);

        Assertions.assertEquals(1, myIntArrayList.getCurrentIdx());
    }
}
