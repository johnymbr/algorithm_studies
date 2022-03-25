import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BoatsToSavePeopleTest {

    @Test
    public void test1() {
        BoatsToSavePeople b = new BoatsToSavePeople();
        Assertions.assertEquals(1, b.numRescueBoats(new int[]{1, 2}, 3));
    }

    @Test
    public void test2() {
        BoatsToSavePeople b = new BoatsToSavePeople();
        Assertions.assertEquals(3, b.numRescueBoats(new int[]{3, 2, 2, 1}, 3));
    }

    @Test
    public void test3() {
        BoatsToSavePeople b = new BoatsToSavePeople();
        Assertions.assertEquals(4, b.numRescueBoats(new int[]{3, 5, 3, 4}, 5));
    }

    @Test
    public void test4() {
        BoatsToSavePeople b = new BoatsToSavePeople();
        Assertions.assertEquals(1, b.numRescueBoats(new int[]{2, 2}, 6));
    }
}
