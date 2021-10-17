import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyIntArrayListTest {

    @Test
    void testAdd() {
        MyIntArrayList myIntArrayList = new MyIntArrayList();
        myIntArrayList.add(1);

        Assertions.assertEquals(1, myIntArrayList.getCurrentIdx());
    }

    @Test
    void testAddWithIdx() {
        MyIntArrayList myIntArrayList = new MyIntArrayList();
        myIntArrayList.add(1);
        myIntArrayList.add(2);
        myIntArrayList.add(3);
        myIntArrayList.add(1, 4);

        Assertions.assertEquals(4, myIntArrayList.get(1));
    }

    @Test
    void testAddWithIdxOut() {
        MyIntArrayList myIntArrayList = new MyIntArrayList();
        myIntArrayList.add(1);
        myIntArrayList.add(2);
        myIntArrayList.add(3);

        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
            myIntArrayList.get(4);
        });
    }

    @Test
    void testRemove() {
        MyIntArrayList myIntArrayList = new MyIntArrayList();
        myIntArrayList.add(1);
        myIntArrayList.add(2);
        myIntArrayList.add(3);
        myIntArrayList.add(4);
        myIntArrayList.add(5);

        Assertions.assertTrue(myIntArrayList.remove(2));
        Assertions.assertEquals(4, myIntArrayList.getCurrentIdx());
    }

    @Test
    void testRemoveThrowsException() {
        MyIntArrayList myIntArrayList = new MyIntArrayList();
        myIntArrayList.add(1);
        myIntArrayList.add(2);
        myIntArrayList.add(3);

        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
            myIntArrayList.remove(4);
        });
    }
}
