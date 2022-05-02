import java.util.HashSet;

public class KokoEatingBananas {

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 1;
        for (int i : piles) {
            right = Math.max(right, i);
        }

        while (left < right) {
            int middle = left + (right - left) / 2;
            int hourSpent = 0;

            for (int pile : piles) {
                hourSpent += Math.ceil((double) pile / middle);
            }

            if (hourSpent <= h) right = middle;
            else left = middle + 1;
        }

        return right;
    }
}
