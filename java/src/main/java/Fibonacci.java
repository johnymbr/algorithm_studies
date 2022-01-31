public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        for (int i = 0; i < 30; i++) {
            System.out.printf("( %d ): %d%n", i, f.fibonacci(i));
        }
    }

    public long fibonacci(int n) {
        if (n < 2) return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
