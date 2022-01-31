public class Fatorial {

    public static void main(String[] args) {
        Fatorial f = new Fatorial();
        int n = 10;
        System.out.printf("(%d): %d", n, f.fatorial(n));
    }

    public long fatorial(int n) {
        if (n < 2) return 1;

        return n * fatorial(n - 1);
    }
}
