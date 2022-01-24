public class Sqrtx {

    public static void main(String[] args) {
        Sqrtx sqrtx = new Sqrtx();
        System.out.println(sqrtx.mySqrt(8));
    }

    public int mySqrt(int x) {
        if (x < 2) return x;

        int start = 0;
        int end = x;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (x / mid < mid) {
                end = mid - 1;
            } else if (x / mid > mid) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return end;
    }
}
