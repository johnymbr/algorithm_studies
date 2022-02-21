public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int np = 0;
        int ant = -1;
        int countDup = 0;
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if (cur == ant)
                countDup++;
            else
                countDup = 1;

            if (countDup < 3) {
                nums[np] = cur;
                np++;
            }

            ant = cur;
        }

        return np;
    }
}
