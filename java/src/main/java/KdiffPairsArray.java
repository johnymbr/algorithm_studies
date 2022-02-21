import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class KdiffPairsArray {

    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int count = 0;
        Set<Integer> set = map.keySet();
        for (Integer i : set) {
            if (k > 0 && map.containsKey(i + k)) count++;

            if (k == 0 && map.get(i) > 1) count++;
        }

        return count;
    }
}
