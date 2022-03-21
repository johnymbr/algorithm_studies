import java.util.Collections;

public class CoreJavaTest {

    protected String x = "123456";

    public CoreJavaTest() {
    }

    public CoreJavaTest(int a, int b) {
        System.out.println("(int, int) a = " + a + " b = " + b);
    }

    public CoreJavaTest(int a, float b) {
        System.out.println("(int, float) a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        byte a = 10;
        byte b = 15;
        CoreJavaTest c = new CoreJavaTest(a, b);

        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        if (i1 == i2) {
            System.out.println("sao iguais");
        } else {
            System.out.println("sao diferentes");
        }
    }
}

class SubCoreJavaTest {
    public void test() {
        CoreJavaTest c = new CoreJavaTest();
        System.out.println(c.x);
    }
}