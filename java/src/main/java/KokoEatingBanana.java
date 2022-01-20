public class KokoEatingBanana {

    public static void main(String[] args) {
        KokoEatingBanana keb = new KokoEatingBanana();

        System.out.println(keb.minEatingSpeed1(new int[]{3,6,7,11}, 8));
        System.out.println(keb.minEatingSpeed2(new int[]{3,6,7,11}, 8));
    }

    public int minEatingSpeed1(int[] piles, int h) {
        int speed = 1;

        while (true) {
            int hourSpent = 0;

            for (int pile : piles) {
                hourSpent += Math.ceil((double) pile / speed);
                if (hourSpent > h) break;
            }

            if (hourSpent <= h) return speed;
            else speed += 1;
        }
    }

    public int minEatingSpeed2(int[] piles, int h) {
        int left = 1, right = 1;

        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {
            int middle = (left + right) / 2;
            int hourSpent = 0;

            for (int pile : piles) {
                hourSpent += Math.ceil((double) pile / middle);
            }

            if (hourSpent <= h) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }

        return right;
    }
}
