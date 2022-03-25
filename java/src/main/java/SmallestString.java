public class SmallestString {

    public String getSmallestString(int n, int k) {
        char[] res = new char[n];
        for (int i = 0; i < n; i++) {
            res[i] = 'a';
            k--;
        }

        while (k > 0) {
            int minValue = Math.min(25, k);
            res[--n] += minValue;
            k -= minValue;
        }

        return String.valueOf(res);
    }
}
